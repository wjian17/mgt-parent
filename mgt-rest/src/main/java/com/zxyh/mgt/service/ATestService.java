package com.zxyh.mgt.service;


import com.zxyh.mgt.jpa.pojo.ATestPojo;

import java.util.List;

/**
 * Created by wjian17 on 2019/9/2.
 */
public interface ATestService {

    List<ATestPojo> findAll();

    ATestPojo save(ATestPojo aTestPojo);

    List<ATestPojo> saveAll(Iterable<ATestPojo> aTestPojos);

    List<ATestPojo> saveAll(List<ATestPojo> aTestPojos);

}
