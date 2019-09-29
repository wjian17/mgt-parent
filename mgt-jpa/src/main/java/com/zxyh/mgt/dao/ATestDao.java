package com.zxyh.mgt.dao;

import com.zxyh.mgt.jpa.pojo.ATestPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by wjian17 on 2019/8/30.
 */
@Component
public interface ATestDao extends JpaRepository<ATestPojo,Long> {

}
