package com.etoak.controller;

import com.etoak.service.YunHttpClentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
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
    public void create () {
        try {
            yunHttpClentService.createRoomTest();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
