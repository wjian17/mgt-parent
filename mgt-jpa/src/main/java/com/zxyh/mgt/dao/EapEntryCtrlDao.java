package com.zxyh.mgt.dao;

import com.zxyh.mgt.jpa.pojo.EapEntryCtrlPojo;
import com.zxyh.mgt.jpa.pojo.EapEntryCtrlPojoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by wjian17 on 2019/8/30.
 */
@Component
public interface EapEntryCtrlDao extends JpaRepository<EapEntryCtrlPojo,EapEntryCtrlPojoPK> {
}
