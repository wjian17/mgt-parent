package com.zxyh.mgt.service;

import com.zxyh.mgt.jpa.pojo.EapEntryCtrlPojo;

import java.util.List;

/**
 * Created by wjian17 on 2019/9/2.
 */
public interface EapEntryCtrlService {

    List<EapEntryCtrlPojo> findAll();

    List<EapEntryCtrlPojo> saveAll(Iterable<EapEntryCtrlPojo> iterable);

    List<EapEntryCtrlPojo> saveAll(List<EapEntryCtrlPojo> eapEntryCtrlPojos);

}
