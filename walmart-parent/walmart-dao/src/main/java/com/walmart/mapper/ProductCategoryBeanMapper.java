package com.walmart.mapper;

import com.walmart.pojo.ProductCategoryBean;
import com.walmart.pojo.ProductCategoryBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCategoryBeanMapper {
    int countByExample(ProductCategoryBeanExample example);

    int deleteByExample(ProductCategoryBeanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductCategoryBean record);

    int insertSelective(ProductCategoryBean record);

    List<ProductCategoryBean> selectByExample(ProductCategoryBeanExample example);

    ProductCategoryBean selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductCategoryBean record, @Param("example") ProductCategoryBeanExample example);

    int updateByExample(@Param("record") ProductCategoryBean record, @Param("example") ProductCategoryBeanExample example);

    int updateByPrimaryKeySelective(ProductCategoryBean record);

    int updateByPrimaryKey(ProductCategoryBean record);
}