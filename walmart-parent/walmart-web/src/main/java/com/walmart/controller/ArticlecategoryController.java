package com.walmart.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.Result;
import com.walmart.pojo.Articlecategory;
import com.walmart.service.ArticlecategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("articlecategory")
public class ArticlecategoryController {
    @Reference
    private ArticlecategoryService articlecategoryService;
    /**
     * 查询-文章分类
     * @return
     */
    @RequestMapping("query")
    public List<Articlecategory> Productcategoryquery(){
        return articlecategoryService.articlecategoryquery();
    }

    /**
     * 新增-文章分类
     * @param articlecategory
     * @return
     */
    @RequestMapping("add")
    public Result add(Articlecategory articlecategory){

        try {
            articlecategoryService.add(articlecategory);
            return new Result(true,"新增成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"新增失败!");
    }

    /**
     * 删除-文章分类
     * @param id
     */
    @RequestMapping("delete")
    public void delete(long id){
        articlecategoryService.delete(id);
    }

    /**
     * 回显-文章分类
     * @param id
     * @return
     */
    @RequestMapping("findOne")
    public Articlecategory findOne(Long id){
        return articlecategoryService.findOne(id);
    }

    /**
     * 修改-文章分类
     * @param articlecategory
     */
    @RequestMapping("update")
    public void update(Articlecategory articlecategory){
        articlecategoryService.update(articlecategory);
    }


}
