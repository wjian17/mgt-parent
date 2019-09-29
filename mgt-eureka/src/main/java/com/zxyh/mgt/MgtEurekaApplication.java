package com.zxyh.mgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wjian17 on 2019/8/13.
 */
@EnableEurekaServer
@EnableAutoConfiguration
public class MgtEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MgtEurekaApplication.class,args);
    }
}
