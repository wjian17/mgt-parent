package com.zxyh.mgt.service.impl;

import com.zxyh.mgt.dao.BpTranControlDao;
import com.zxyh.mgt.jpa.pojo.BpTranControlPojo;
import com.zxyh.mgt.service.BpTranControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Created by wjian17 on 2019/9/6.
 */
@Service
public class BpTranControlServiceImpl implements BpTranControlService {

    @Autowired
    private BpTranControlDao bpTranControlDao;


    @Override
    public Page<BpTranControlPojo> findByPage(PageRequest page) {
        return bpTranControlDao.findAll(page);
    }
}
