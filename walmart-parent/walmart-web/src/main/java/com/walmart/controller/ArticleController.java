package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.entity.Result;
import com.walmart.pojo.Article;
import com.walmart.service.ArticleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("article")
public class ArticleController {
    @Reference
    private ArticleService articleService;
    /**
     * 分页查询-文章管理
     * @return
     */
    @RequestMapping("search")
    public PageResult search(Article article, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "3") int rows){

        return articleService.search(article,rows,page);
    }

    /**
     * 新增-文章管理
     * @param article
     * @return
     */
    @RequestMapping("add")
    public Result add(Article article){

        try {
            articleService.add(article);
            return new Result(true,"新增成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"新增失败!");
    }

    /**
     * 批量删除-文章管理
     * @param ids
     */
    @RequestMapping("delete")
    public void delete(Long[] ids){
        articleService.delete(ids);
    }

    /**
     * 回显-文章管理
     * @param id
     * @return
     */
    @RequestMapping("findOne")
    public Article findOne(Long id){
        return articleService.findOne(id);
    }

    /**
     * 修改-文章管理
     * @param article
     */
    @RequestMapping("update")
    public void update(Article article){
        articleService.updateproducttag(article);
    }

}
