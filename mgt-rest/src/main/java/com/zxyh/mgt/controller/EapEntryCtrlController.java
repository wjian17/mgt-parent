package com.zxyh.mgt.controller;

import com.zxyh.mgt.jpa.pojo.EapEntryCtrlPojo;
import com.zxyh.mgt.service.EapEntryCtrlService;
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
@RequestMapping(value = "/eapEntryCtrl")
public class EapEntryCtrlController {

    @Autowired
    private EapEntryCtrlService eapEntryCtrlService;

    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public List<EapEntryCtrlPojo> findAll(){
        return eapEntryCtrlService.findAll();
    }

    @RequestMapping(value = "/saveAll",method = RequestMethod.POST)
    public List<EapEntryCtrlPojo> saveAll(@RequestBody List<EapEntryCtrlPojo> eapEntryCtrlPojos){
        return eapEntryCtrlService.saveAll(eapEntryCtrlPojos);
    }

    @RequestMapping(value = "/saveAll2",method = RequestMethod.POST)
    public List<EapEntryCtrlPojo> saveAll2(@RequestBody List<EapEntryCtrlPojo> eapEntryCtrlPojos){
        return eapEntryCtrlService.saveAll(eapEntryCtrlPojos);
    }
}
