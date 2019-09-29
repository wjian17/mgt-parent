package com.zxyh.mgt.dao;

import com.zxyh.mgt.jpa.pojo.BpTranControlPojo;
import com.zxyh.mgt.jpa.pojo.EapEntryCtrlPojoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by wjian17 on 2019/9/6.
 */
@Component
public interface BpTranControlDao extends JpaRepository<BpTranControlPojo,EapEntryCtrlPojoPK> {
}
