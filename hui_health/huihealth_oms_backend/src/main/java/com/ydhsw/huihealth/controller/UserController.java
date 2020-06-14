package com.ydhsw.huihealth.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ydhsw.huihealth.common.MessageConst;
import com.ydhsw.huihealth.entiry.Result;
import com.ydhsw.huihealth.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：wsydh
 * @date ：Created in 2020/6/13
 * @description ：
 * @version: 1.0
 */
/**自动返回json格式*/
@RestController
public class UserController {
    @Reference
    private UserService userService;
    @RequestMapping("/login")
    public Result login(String username,String password){
        if (userService.login(username,password)){
            return new Result(true, MessageConst.ACTION_SUCCESS,username);
        }
        return new Result(false,MessageConst.ACTION_FAIL);
    }
}
