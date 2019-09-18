package com.walmart.mapper;

import com.walmart.pojo.Stocklog;
import com.walmart.pojo.StocklogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StocklogMapper {
    int countByExample(StocklogExample example);

    int deleteByExample(StocklogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Stocklog record);

    int insertSelective(Stocklog record);

    List<Stocklog> selectByExample(StocklogExample example);

    Stocklog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Stocklog record, @Param("example") StocklogExample example);

    int updateByExample(@Param("record") Stocklog record, @Param("example") StocklogExample example);

    int updateByPrimaryKeySelective(Stocklog record);

    int updateByPrimaryKey(Stocklog record);
}