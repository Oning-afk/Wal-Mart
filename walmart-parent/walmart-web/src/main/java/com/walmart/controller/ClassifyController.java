package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.pojo.Storecategory;
import com.walmart.service.ClassifyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("classify")
public class ClassifyController {
    @Reference
    private ClassifyService classifyService;
    @RequestMapping("findclassify")
    public List<Storecategory> findclassify(){
        return classifyService.findclassify();
    }
    @RequestMapping("saveclassify")
    public void saveclassify(Storecategory storecategory){
        storecategory.setCreateddate(new Date());
        storecategory.setLastmodifieddate(new Date());
        storecategory.setName("ss");
        storecategory.setOrders(1);

        classifyService.saveclassify(storecategory);
    }
    @RequestMapping("dleclassify")
    public void dleclassify(Long id){
        classifyService.dleclassify(id);
    }
    @RequestMapping("selectclassify")
    public List<Storecategory> selectclassify(Integer id){
        return classifyService.selectclassify(id);
    }

}
