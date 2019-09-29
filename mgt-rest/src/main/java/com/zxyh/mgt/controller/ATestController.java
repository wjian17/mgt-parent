package com.zxyh.mgt.controller;

import com.zxyh.mgt.jpa.pojo.ATestPojo;
import com.zxyh.mgt.service.ATestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wjian17 on 2019/9/2.
 */
@RestController
@RequestMapping(value = "/atest")
public class ATestController {

    @Autowired
    private ATestService aTestService;

    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public List<ATestPojo> findAll(){
        return aTestService.findAll();
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ATestPojo save(@RequestBody ATestPojo aTestPojo){
        return aTestService.save(aTestPojo);
    }
    @RequestMapping(value = "/saveAll",method = RequestMethod.POST)
    public List<ATestPojo> save(@RequestBody List<ATestPojo> aTestPojos){
        return aTestService.saveAll(aTestPojos);
    }
}
