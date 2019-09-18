package com.walmart.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.pojo.Pointlog;
import com.walmart.service.ManageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("manage")
public class ManageController {
@Reference
    private ManageService manageService;
@RequestMapping("findmanage")
public List<Pointlog> findmanage(){

    return manageService.findmanage();
}
    @RequestMapping("savemanage")
   public void savemanage(Pointlog pointlog){
        pointlog.setCreateddate(new Date());
        pointlog.setLastmodifieddate(new Date());
        pointlog.setBalance(1);
        pointlog.setMemberId(1111);

    manageService.savemanage(pointlog);
    }
    @RequestMapping("delmanage")
   public void delmanager(Long id){

    manageService.delmanager(id);
   }
   @RequestMapping("findmanageid")
   public List<Pointlog> findmanageid(Long id){

    return  manageService.findmanageid(id);
   }
   @RequestMapping("updatemanage")
   public void findmanageid(Pointlog pointlog){
         manageService.updatemanage(pointlog);
   }
    @RequestMapping("delmanageall")
    public void delmanageall(Long[] id){

    manageService.delmanageall(id);
    }
}
