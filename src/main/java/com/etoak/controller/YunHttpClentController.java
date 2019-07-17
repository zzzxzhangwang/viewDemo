package com.etoak.controller;

import com.etoak.service.YunHttpClentService;
import com.etoak.util.Constants;
import com.etoak.util.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@ResponseBody
public class YunHttpClentController {

    @Autowired
    private YunHttpClentService yunHttpClentService;


    @GetMapping("/addQueue")
    public void testQueue () {
        try {
            yunHttpClentService.addQueue();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    @GetMapping("/createRoom")
    public String create (String LimitUserNum,String NeedPswd,String IsRegular) {
        String result = "没有数据";
        try {
//            String data = "{'CompID':"+ Constants.CompID +",'SecretKey':"+Constants.CompSecret+",'LimitUserNum':'2'}";
            Map<String,String> map = new HashMap<String,String>();
            if (LimitUserNum != null && !LimitUserNum.isEmpty()){
                map.put("LimitUserNum",LimitUserNum);
            }
            if (NeedPswd != null && !NeedPswd.isEmpty()){
                map.put("NeedPswd",NeedPswd);
            }
            if (IsRegular != null && !IsRegular.isEmpty()){
                map.put("IsRegular",IsRegular);
            }
            result =  yunHttpClentService.createRoomTest(Tool.getParam(map));
        }catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    @GetMapping("/onlineusersnum")
    public String onlineusersnum (String RoomIds) {
        String result = "没有数据";
        try {
//            String data = "{'CompID':"+ Constants.CompID +",'SecretKey':"+Constants.CompSecret+",'LimitUserNum':'2'}";
            Map<String,String> map = new HashMap<String,String>();
            if (RoomIds == null){
                return "参数不能为空";
            }
            map.put("RoomIds",RoomIds);
            result =  yunHttpClentService.onlineusersnum(Tool.getParam(map));
        }catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
