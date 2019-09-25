package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Specification;
import com.walmart.pojo.SpecificationAndProductCategoryBeanMapper;

import java.util.List;

public interface SpecificationService {

    /**
     * 规格管理查询 分页
     * @param specification
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageResult findSpecification(Specification specification,Integer pageSize,Integer pageNum);

    /**
     * 规格管理 批量删除
     * @param ids
     * @return
     */
    boolean delSpecification(String [] ids);

    /**
     * 规格管理 新增
     * @param specification
     */
    public void addSpecification(Specification specification);

    /**
     * 商品属性 回显
     * @param id
     * @return
     */
    Specification seachSpecifion(Long id);





    public List<Specification> specificationQuery();

    List<SpecificationAndProductCategoryBeanMapper> findStockAll();
}