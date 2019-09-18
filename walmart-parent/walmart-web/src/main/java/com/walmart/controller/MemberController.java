package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Member;
import com.walmart.service.MemberService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @program: Wal-Mart
 * @description: 会员管理层
 * @author: 邓希凡
 * @create: 2019-09-15 22:34
 **/
@RestController
@RequestMapping("member")
@RequiresPermissions("admin:member")
public class MemberController {

    @Reference
    private MemberService memberService;

    /**
    * @Description: 会员列表查询
    * @Param: pageSize每页几条,pageNum第几页,条件
    * @return: PageResult
    * @Author: 邓希凡
    * @Date: 2019/9/16
    */
    @RequestMapping("findMember")
    public PageResult findMember(@RequestParam(defaultValue = "20") int pageSize, @RequestParam(defaultValue = "1") int pageNum, Member member){
        return memberService.findMember(pageSize,pageNum,member);
    }

}
