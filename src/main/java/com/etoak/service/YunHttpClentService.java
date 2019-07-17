package com.etoak.service;

import okhttp3.Response;

import java.io.IOException;
import java.util.Map;

public interface YunHttpClentService {

    String createRoomTest(String param) throws IOException;

    void addQueue() throws IOException;

    void queryQueue() throws IOException;

    void getFiles() throws  IOException;

}
