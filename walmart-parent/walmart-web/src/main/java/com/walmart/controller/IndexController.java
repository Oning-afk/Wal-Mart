package com.walmart.controller;

import com.walmart.entity.ActiveUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: Wal-Mart
 * @description:
 * @author: 邓希凡
 * @create: 2019-09-18 19:09
 **/
@Controller
public class IndexController {

    @RequestMapping("first")
    public String first(Model model){

        //获得主体
        Subject subject = SecurityUtils.getSubject();
        //取出身份信息
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        //通过model传到页面
        model.addAttribute("activeUser", activeUser);
        return "admin/index";
    }
}
