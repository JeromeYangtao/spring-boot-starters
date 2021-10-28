package com.mianyun.springbootstarterdemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: mianyun.yt
 * @Date: 2021/10/25
 */
@Component
public class MyStarterService implements MyStarterServiceInterface {

    @Value("${my-starter.code:18}")
    Integer code;

    @Value("${my-starter.message:hello world}")
    String message;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}

