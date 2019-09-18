package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.pojo.Storerank;
import com.walmart.service.GradeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("grade")
@RequiresPermissions("admin:storerank")
public class GradeController {
    @Reference
    private GradeService gradeService;

    @RequestMapping("findGrade")
    public List<Storerank> findgrade(@RequestParam(defaultValue = "1") Boolean isallowregister){

    return gradeService.findgrade(isallowregister);
}
    @RequestMapping("saveGrade")
    public void savegrade(Storerank storerank){
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
}
