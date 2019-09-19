package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.entity.Result;
import com.walmart.pojo.Parameter;
import com.walmart.pojo.Productcategory;
import com.walmart.service.ParameterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("parameter")
public class ParameterController {
    @Reference
    private ParameterService parameterService;

    /**
     * 分页查询-商品参数
     * @return
     */
    @RequestMapping("search")
    public PageResult search(Parameter parameter, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "3") int rows){
        return parameterService.search(parameter,rows,page);
    }

    @RequestMapping("query")
    public List<Productcategory> Productcategoryquery(){
        return parameterService.Productcategoryquery();
    }
    /**
     * 新增-商品参数
     * @param parameter
     * @return
     */
    @RequestMapping("add")
    public Result add(Parameter parameter){

        try {
            parameterService.add(parameter);
            return new Result(true,"新增成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"新增失败!");
    }

    /**
     * 批量删除-商品参数
     * @param ids
     */
    @RequestMapping("delete")
    public void delete(Long[] ids){
        parameterService.delete(ids);
    }

    /**
     * 回显-商品参数
     * @param id
     * @return
     */
    @RequestMapping("findOne")
    public Parameter findOne(Long id){
        return parameterService.findOne(id);
    }

    /**
     * 修改-商品参数
     * @param parameter
     */
    @RequestMapping("update")
    public void update(Parameter parameter){
        parameterService.updateproducttag(parameter);
    }


}
