package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.pojo.Memberattribute;
import com.walmart.service.RegisterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("register")
public class RegisterController {
@Reference
    private RegisterService registerService;
@RequestMapping("findregister")
    public List<Memberattribute> findregister(){

    return registerService.findregister();
}
    @RequestMapping("saveregister")
    public void saveregister(Memberattribute memberattribute){
        memberattribute.setCreateddate(new Date());
        memberattribute.setLastmodifieddate(new Date());
        memberattribute.setVersion(1);
        memberattribute.setIsenabled(true);
        memberattribute.setPropertyindex(1);
        memberattribute.setPattern("");
        memberattribute.setOptions("");
        memberattribute.setIsrequired(false);
    registerService.saveregister(memberattribute);
    }
    @RequestMapping("delregister")
    public void delregister(Long id){
        registerService.delregister(id);
    }
    @RequestMapping("findregisterid")
    public List<Memberattribute> findregisterid(Long id){
       return registerService.findregisterid(id);
    }
    @RequestMapping("updateregister")
    public void updateregister(Memberattribute memberattribute){

    registerService.updateregister(memberattribute);
    }
    @RequestMapping("delgisterall")
    public void  delgisterall(Long[] id){

    registerService.delgisterall(id);
    }
}
