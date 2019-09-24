package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Storeproducttag;
import com.walmart.service.SptagService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("storeproducttag")
public class SptagController {
    @Reference
    private SptagService sptagService;
    @RequestMapping("findsptag")
    public List<Storeproducttag> findsptag(){
        return sptagService.findsptag();
    }
    @RequestMapping("savesptag")
    public void savesptag(Storeproducttag storeproducttag){
         sptagService.savesptag(storeproducttag);
    }
    @RequestMapping("delsptagall")
    public void delsptagall(Long[] id){
         sptagService.delsptagall(id);
    }
    @RequestMapping("findAll")
    public PageResult findAll(Storeproducttag storeproducttag, @RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "5")Integer rows){
      return   sptagService.findAll(storeproducttag,page,rows);
    }
}
