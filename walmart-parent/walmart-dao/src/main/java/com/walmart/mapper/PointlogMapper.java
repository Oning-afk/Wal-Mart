package com.walmart.mapper;

import com.walmart.pojo.Pointlog;
import com.walmart.pojo.PointlogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PointlogMapper {
    int countByExample(PointlogExample example);

    int deleteByExample(PointlogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Pointlog record);

    int insertSelective(Pointlog record);

    List<Pointlog> selectByExample(PointlogExample example);

    Pointlog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Pointlog record, @Param("example") PointlogExample example);

    int updateByExample(@Param("record") Pointlog record, @Param("example") PointlogExample example);

    int updateByPrimaryKeySelective(Pointlog record);

    int updateByPrimaryKey(Pointlog record);
}