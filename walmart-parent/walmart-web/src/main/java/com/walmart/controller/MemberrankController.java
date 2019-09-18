package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Memberrank;
import com.walmart.service.MemberrankService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/memberrank")
public class MemberrankController {
    @Reference(timeout = 60000)
    private MemberrankService memberrankService;
    @RequestMapping("/searchMemberrank")
    public PageResult searchMemberrank(Memberrank memberrank, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer rows){

        return memberrankService.findPageMemberrank(memberrank,rows,page);
    }
    @RequestMapping("/addMemberrank")
    public  void addMemberrank(Memberrank memberrank){
        memberrankService.addMemberrank(memberrank);
    }
}
