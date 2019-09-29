package com.zxyh.mgt.controller;

import com.zxyh.mgt.service.BpTranControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wjian17 on 2019/9/6.
 */
@RestController
@RequestMapping("BpTranControl")
public class BpTranControlController {

    @Autowired
    private BpTranControlService bpTranControlService;

}
