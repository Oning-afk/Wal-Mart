package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.pojo.Storerank;
import com.walmart.service.GradeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("grade")
public class GradeController {
    @Reference
    private GradeService gradeService;
/**
* @Param
*
* */
@RequestMapping("findGrade")
    public List<Storerank> findgrade(){

    return gradeService.findgrade();
}
    @RequestMapping("saveGrade")
    public void savegrade(Storerank storerank){
        storerank.setCreateddate(new Date());
        storerank.setLastmodifieddate(new Date());
        storerank.setIsallowregister(true);
        storerank.setVersion((long)0);
        storerank.setServicefee(BigDecimal.ONE);

    gradeService.savegrade(storerank);
    }
    @RequestMapping("delGrade")
    public void delgrade(Long id){
         gradeService.delgrade(id);
    }
    @RequestMapping("selectGrade")
    public List<Storerank> selectgrade(Long id){
        return gradeService.selectgrade(id);
    }
    @RequestMapping("delGradeall")
    public void delGradeall(Long[] id){
        gradeService.delGradeall(id);
    }
    
}
