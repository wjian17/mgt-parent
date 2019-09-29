package com.zxyh.mgt.service.impl;

import com.zxyh.mgt.dao.ATestDao;
import com.zxyh.mgt.jpa.pojo.ATestPojo;
import com.zxyh.mgt.service.ATestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wjian17 on 2019/9/2.
 */
@Service
public class ATestServiceImpl implements ATestService {

    @Autowired
    private ATestDao aTestDao;

    @Override
    public List<ATestPojo> findAll() {
        return aTestDao.findAll();
    }

    @Override
    public ATestPojo save(ATestPojo aTestPojo) {
        return aTestDao.save(aTestPojo);
    }

    @Override
    public List<ATestPojo> saveAll(Iterable<ATestPojo> aTestPojos) {
        return aTestDao.saveAll(aTestPojos);
    }
    @Override
    public List<ATestPojo> saveAll(List<ATestPojo> aTestPojos) {
        return aTestDao.saveAll(aTestPojos);
    }
}
