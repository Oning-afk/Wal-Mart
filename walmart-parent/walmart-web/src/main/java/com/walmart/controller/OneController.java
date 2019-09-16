package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.pojo.Storecategory;
import com.walmart.service.OneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
@Controller("one")
public class OneController {
    @Reference
    private OneService oneService;
    public List<Storecategory>  find(){
return oneService.find();
    }
    @RequestMapping("delone")
    public void delone(Long id){
        oneService.delone(id);
    }
    @RequestMapping("svaeone")
    public void saveone(Storecategory storecategory){
        oneService.saveone(storecategory);
    }
    @RequestMapping("findone")
    public List<Storecategory> findone(Long id){
        return oneService.findone(id);
    }
    @RequestMapping("updateone")
    public void updateone(Storecategory storecategory){
         oneService.updateone(storecategory);
    }
}
