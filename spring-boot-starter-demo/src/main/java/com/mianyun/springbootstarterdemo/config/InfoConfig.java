package com.mianyun.springbootstarterdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: mianyun.yt
 * @Date: 2021/10/25
 */
@ConfigurationProperties(prefix = "my-starter")
@Component
public class InfoConfig {

    private Integer code = 2000;

    private String message = "hello world from InfoConfig";

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
