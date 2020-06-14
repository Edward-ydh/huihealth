package com.ydhsw.huihealth.service;

/**
 * @author ：wsydh
 * @date ：Created in 2020/6/13
 * @description ：
 * @version: 1.0
 */
public interface UserService {
    /**
     * 登入测试
     * @param username
     * @param password
     * @return
     */
    boolean login(String username,String password);
}
