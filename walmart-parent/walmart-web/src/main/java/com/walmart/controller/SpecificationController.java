package com.walmart.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Specification;
import com.walmart.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/specification")
public class SpecificationController {

    @Reference
    private SpecificationService specificationService;

    @RequestMapping("/findSpecification")
    public PageResult findSpecification(Specification specification,@RequestParam(defaultValue = "1")Integer pageSize,@RequestParam(defaultValue = "24")Integer pageNum){

        return specificationService.findSpecification(specification,pageSize,pageNum);
    }
    @RequestMapping("/delSpecification")
    public boolean delSpecification(String [] ids){

        return specificationService.delSpecification(ids);
    }
}
