package com.ydhsw.huihealth.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ydhsw.huihealth.service.UserService;
import lombok.extern.slf4j.Slf4j;


/**
 * @author ：wsydh
 * @date ：Created in 2020/6/13
 * @description ：
 * @version: 1.0
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(String username, String password) {
        log.debug("u:{},o:{}",username,password);
        if ("admin".equals(username)&&"123".equals(password)){
            return true;
        }
        return false;
    }
}
