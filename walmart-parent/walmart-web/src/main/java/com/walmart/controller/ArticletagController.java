package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.entity.Result;
import com.walmart.pojo.Articletag;
import com.walmart.service.ArticletagService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("articletag")
public class ArticletagController {
    @Reference
    private ArticletagService articletagService;
    /**
     * 分页查询-文章标签
     * @return
     */
    @RequestMapping("search")
    public PageResult search(Articletag articletag, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "3") int rows){
        return articletagService.search(articletag,rows,page);
    }

    /**
     * 新增-文章标签
     * @param articletag
     * @return
     */
    @RequestMapping("add")
    public Result add(Articletag articletag){

        try {
            articletagService.add(articletag);
            return new Result(true,"新增成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"新增失败!");
    }

    /**
     * 批量删除-文章标签
     * @param ids
     */
    @RequestMapping("delete")
    public void delete(Long[] ids){
        articletagService.delete(ids);
    }

    /**
     * 回显-文章标签
     * @param id
     * @return
     */
    @RequestMapping("findOne")
    public Articletag findOne(Long id){
        return articletagService.findOne(id);
    }

    /**
     * 修改-文章标签
     * @param articletag
     */
    @RequestMapping("update")
    public void update(Articletag articletag){
        articletagService.updateproducttag(articletag);
    }

}
