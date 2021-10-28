package com.mianyun.springbootstarterdemo;

import com.mianyun.springbootstarterdemo.config.InfoConfig;
import com.mianyun.springbootstarterdemo.service.MyStarterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyStarterServiceTest {
    @Autowired
    MyStarterService myStarterService;

    @Autowired
    InfoConfig infoConfig;

    @Test
    void getMessage() {
        System.out.println(myStarterService.getMessage());
    }

    @Test
    void getCode() {
        System.out.println(myStarterService.getCode());
    }

    @Test
    public void getInfo2() {
        System.out.println(infoConfig.getCode());
        System.out.println(infoConfig.getMessage());
    }
}