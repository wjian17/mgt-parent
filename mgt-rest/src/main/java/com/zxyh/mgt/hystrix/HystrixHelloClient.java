package com.zxyh.mgt.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zxyh.mgt.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author WJ
 */
@Service("hystrixHelloClient")
public class HystrixHelloClient {

    @Autowired
    @Qualifier("helloFeign")
    private HelloFeign helloFeign;

    @HystrixCommand(groupKey = "helloGroup", fallbackMethod = "fallBackCall")
    public String hello() {
        return this.helloFeign.hello();
    }

    public String fallBackCall() {
        String fallback = ("FAILED SERVICE CALL! - FALLING BACK");
        return fallback;
    }
}
