package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.pojo.Storecategory;
import com.walmart.service.TowService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tow")
public class TowController {
    @Reference
    private TowService towService;
    public List<Storecategory> find(){
        return towService.find();
    }
    @RequestMapping("deltow")
    public void deltow(Long id){
        towService.deltow(id);
    }
    @RequestMapping("svaetow")
    public void savetow(Storecategory storecategory){
        towService.savetow(storecategory);
    }
    @RequestMapping("findtow")
    public List<Storecategory> findtow(Long id){
        return towService.findtow(id);
    }
    @RequestMapping("updatetow")
    public void updatetow(Storecategory storecategory){
        towService.updatetow(storecategory);
    }


}
