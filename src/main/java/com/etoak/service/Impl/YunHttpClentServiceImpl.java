package com.etoak.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.etoak.service.YunHttpClentService;
import com.etoak.util.Constants;
import com.etoak.util.MD5Util;
import okhttp3.*;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


@Service
public class YunHttpClentServiceImpl implements YunHttpClentService {

    // 查询房间数
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");

    private static OkHttpClient client = null;

    private static final int SUCCESS_CODE = 200;

    @Override
    public String createRoomTest(String data) throws IOException {
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        String result = "";
        //String url = "http://www.cloudroom.com/api/createroom";
        OkHttpClient client = new OkHttpClient();

        FormBody.Builder builder = new FormBody.Builder();

        RequestBody requestBody = RequestBody.create(JSON, data);
        Request request = new Request.Builder()
                .url(Constants.URL_CREATE_ROOM)
                .post(requestBody)
                .build();
        Response response;
        try {
            response = client.newCall(request).execute();
//            System.out.println(response.body().string());
            result = response.body().string();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {

        }
        return result;
    }
    // 添加队列
    @Override
    public void addQueue() throws IOException {
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        String url = "http://www.cloudroom.com/api/addQueueAPI";
        OkHttpClient client = new OkHttpClient();

        //鍒涘缓琛ㄥ崟璇锋眰鍙傛暟
        FormBody.Builder builder = new FormBody.Builder();
        String data = "{'CompID':'232918','SecretKey':'5ebeae75b9ab77eed46e1062e5b69abb','QueueName':'这是一个测试队列'}";

        RequestBody requestBody = RequestBody.create(JSON, data);
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        Response response;
        try {
            response = client.newCall(request).execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //
    @Override
    public void queryQueue() throws IOException {

    }

    @Override
    public void getFiles() throws IOException {

    }
}
