package com.walmart.mapper;

import com.walmart.pojo.Articlecategory;
import com.walmart.pojo.ArticlecategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticlecategoryMapper {
    int countByExample(ArticlecategoryExample example);

    int deleteByExample(ArticlecategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Articlecategory record);

    int insertSelective(Articlecategory record);

    List<Articlecategory> selectByExample(ArticlecategoryExample example);

    Articlecategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Articlecategory record, @Param("example") ArticlecategoryExample example);

    int updateByExample(@Param("record") Articlecategory record, @Param("example") ArticlecategoryExample example);

    int updateByPrimaryKeySelective(Articlecategory record);

    int updateByPrimaryKey(Articlecategory record);
}