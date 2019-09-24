package com.walmart.mapper;

import com.walmart.pojo.Articletag;
import com.walmart.pojo.ArticletagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticletagMapper {
    int countByExample(ArticletagExample example);

    int deleteByExample(ArticletagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Articletag record);

    int insertSelective(Articletag record);

    List<Articletag> selectByExample(ArticletagExample example);

    Articletag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Articletag record, @Param("example") ArticletagExample example);

    int updateByExample(@Param("record") Articletag record, @Param("example") ArticletagExample example);

    int updateByPrimaryKeySelective(Articletag record);

    int updateByPrimaryKey(Articletag record);
}