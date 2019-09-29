package com.zxyh.mgt.service.impl;

import com.zxyh.mgt.dao.EapEntryCtrlDao;
import com.zxyh.mgt.jpa.pojo.EapEntryCtrlPojo;
import com.zxyh.mgt.service.EapEntryCtrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wjian17 on 2019/9/2.
 */
@Service
public class EapEntryCtrlServiceImpl implements EapEntryCtrlService {

    @Autowired
    private EapEntryCtrlDao eapEntryCtrlDao;

    @Override
    @Transactional(rollbackFor = {Exception.class},isolation = Isolation.READ_COMMITTED,
            propagation = Propagation.MANDATORY)
//    1.REQUIRED:方法在一个事务中执行，如果调用的方法已经在一个事务中，则使用该事务，否则将创建一个
//    新的事务。
//    2.MANDATORY:方法必须在一个事务中执行，也就是说调用的方法必须已经有一个事务，否则新抛出一个错
//    误（ERROR）。
//    3.REQUIRESNEW:方法将在一个新的事务中执行，如果调用的方法已经在一个事务中，则暂停旧的事务。
//    4.SUPPORTS:如果方法在一个事务中被调用，则使用该事务，否则不使用事务。
//    5.NOT_SUPPORTED：如果方法在一个事务中被调用，将抛出一个错误（ERROR）
//    如果没有指定参数，@TransactionAttribute 注释使用REQUIRED 作为默认参数。
    public List<EapEntryCtrlPojo> findAll() {
        return eapEntryCtrlDao.findAll();
    }

    @Override
    public List<EapEntryCtrlPojo> saveAll(List<EapEntryCtrlPojo> eapEntryCtrlPojos) {
        return eapEntryCtrlDao.saveAll(eapEntryCtrlPojos);
    }

    @Override
    public List<EapEntryCtrlPojo> saveAll(Iterable<EapEntryCtrlPojo> iterable) {
        return eapEntryCtrlDao.saveAll(iterable);
    }
}
