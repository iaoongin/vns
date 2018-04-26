package com.xhx.vns.backend.service.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author XHX
 * @date 2018/4/11.
 */
public class BaseService {

    protected final Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Autowired
    protected SqlSessionTemplate sqlSessionTemplate;

}
