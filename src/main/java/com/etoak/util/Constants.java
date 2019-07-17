package com.etoak.util;

public class Constants {
    //在云屋科技后台【账户管理】获取
    public static final String CompID  = "232918";
    //由企业CompID和企业密钥CompSecret经过MD5加密生成的32位小写认证串
    public static final String SecretKey  = "5ebeae75b9ab77eed46e1062e5b69abb";
    //根据一定的规则生成的认证串
    public static final String  CompSecret = "a166f7357644ad3e00d68b8e249aba41";
    //创建房间接口
    public static final String URL_CREATE_ROOM = "http://www.cloudroom.com/api/createroom";
    //查询房间在线人数
    public static final String URL_ONLINE = "http://www.cloudroom.com/api/onlineusersnum";
}
