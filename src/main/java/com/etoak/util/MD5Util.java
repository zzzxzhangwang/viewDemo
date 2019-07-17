package com.etoak.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
    public  static  String MD5(String message){
        String temp = "";
        try {
            MessageDigest md5Digest = MessageDigest.getInstance("MD5");
            byte[] en = md5Digest.digest(message.getBytes());
            temp = coven(en);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return  temp;
    }
    public  static  String coven(byte[] bytes){
        String result = "";
        for(int i = 0;i < bytes.length;i++){
            int temp = bytes[i] & 0xff;
            String tempp = Integer.toHexString(temp);
            if (tempp.length()<2){
                result += "0" + tempp;
            }else{
                result += tempp;
            }
        }
        return result;
    }
}
