package com.walmart.mapper;

import com.walmart.pojo.Productcategory;
import com.walmart.pojo.ProductcategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductcategoryMapper {
    int countByExample(ProductcategoryExample example);

    int deleteByExample(ProductcategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Productcategory record);

    int insertSelective(Productcategory record);

    List<Productcategory> selectByExample(ProductcategoryExample example);

    Productcategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Productcategory record, @Param("example") ProductcategoryExample example);

    int updateByExample(@Param("record") Productcategory record, @Param("example") ProductcategoryExample example);

    int updateByPrimaryKeySelective(Productcategory record);

    int updateByPrimaryKey(Productcategory record);
}