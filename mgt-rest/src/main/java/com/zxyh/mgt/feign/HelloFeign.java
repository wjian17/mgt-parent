package com.zxyh.mgt.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author WJ
 */
@FeignClient("biometrics-bd-face")
@Service("HelloFeign")
public interface HelloFeign {
    @RequestMapping(value = "/", method = GET)
    String hello();
}