package com.mianyun.springbootstarterdemo.config;

import com.mianyun.springbootstarterdemo.service.MyStarterService;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: mianyun.yt
 * @Date: 2021/10/25
 */
@Configuration
@EnableConfigurationProperties
@ComponentScan(basePackages = {"com.mianyun.springbootstarterdemo"})
public class MyConfiguration {
    @Bean
    MyStarterService getService() {
        return new MyStarterService();
    }
}
