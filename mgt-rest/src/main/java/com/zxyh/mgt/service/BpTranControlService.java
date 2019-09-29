package com.zxyh.mgt.service;

import com.zxyh.mgt.jpa.pojo.BpTranControlPojo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * Created by wjian17 on 2019/9/6.
 */
public interface BpTranControlService {

    Page<BpTranControlPojo> findByPage(PageRequest page);
}
