package com.zxyh.mgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by wjian17 on 2019/9/3.
 */
@EnableEurekaClient
@EnableAutoConfiguration
@EnableFeignClients
@EnableHystrix
@EnableWebMvc
@ComponentScan(basePackages = {"com.zxyh.mgt"})
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class,args);
    }
}
