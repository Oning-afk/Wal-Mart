package com.walmart.mapper;

import com.walmart.pojo.Storeproductcategory;
import com.walmart.pojo.StoreproductcategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreproductcategoryMapper {
    int countByExample(StoreproductcategoryExample example);

    int deleteByExample(StoreproductcategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Storeproductcategory record);

    int insertSelective(Storeproductcategory record);

    List<Storeproductcategory> selectByExample(StoreproductcategoryExample example);

    Storeproductcategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Storeproductcategory record, @Param("example") StoreproductcategoryExample example);

    int updateByExample(@Param("record") Storeproductcategory record, @Param("example") StoreproductcategoryExample example);

    int updateByPrimaryKeySelective(Storeproductcategory record);

    int updateByPrimaryKey(Storeproductcategory record);
}