package com.etoak.util;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;
import okhttp3.*;

public class Tool {
    public static String getParam(Map<String,String> map){
        Map<String,String> mapp = getMap();
        map.putAll(mapp);
        String param = JSON.toJSONString(map);
        return param;
    }
    public static  Map<String,String> getMap(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("RequestId","112121221");
        map.put("CompID",Constants.CompID );
        map.put("SecretKey",Constants.SecretKey);
        return map;
    }
    public  static  Request getRequest(String data,String url){
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");

        FormBody.Builder builder = new FormBody.Builder();

        RequestBody requestBody = RequestBody.create(JSON, data);
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        return request;
    }
}
