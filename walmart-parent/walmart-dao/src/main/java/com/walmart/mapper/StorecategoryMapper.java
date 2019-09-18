package com.walmart.mapper;

import com.walmart.pojo.Storecategory;
import com.walmart.pojo.StorecategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StorecategoryMapper {
    int countByExample(StorecategoryExample example);

    int deleteByExample(StorecategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Storecategory record);

    int insertSelective(Storecategory record);

    List<Storecategory> selectByExample(StorecategoryExample example);

    Storecategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Storecategory record, @Param("example") StorecategoryExample example);

    int updateByExample(@Param("record") Storecategory record, @Param("example") StorecategoryExample example);

    int updateByPrimaryKeySelective(Storecategory record);

    int updateByPrimaryKey(Storecategory record);
}