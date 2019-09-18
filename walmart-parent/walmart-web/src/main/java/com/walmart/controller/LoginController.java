package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.exception.CustomException;
import com.walmart.service.AdminService;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: Wal-Mart
 * @description: 登录控制层
 * @author: 邓希凡
 * @create: 2019-09-17 21:30
 **/
@Controller
public class LoginController {

    @Reference
    private AdminService adminService;

    @RequestMapping("login")
    public String login(HttpServletRequest request) throws Exception {

        String shiroLoginFailure = request.getParameter("shiroLoginFailure");

        if(shiroLoginFailure != null){

            if(UnknownAccountException.class.getName().equals(shiroLoginFailure)){
                throw new CustomException("账户不存在");
            }else if(IncorrectCredentialsException.class.getName().equals(shiroLoginFailure)){
                throw new CustomException("用户名或密码错误");
            }else{
                throw new Exception();
            }
        }

        return "login";
    }
}
