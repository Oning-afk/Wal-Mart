package com.walmart.mapper;

import com.walmart.pojo.Parameter;
import com.walmart.pojo.ParameterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ParameterMapper {
    int countByExample(ParameterExample example);

    int deleteByExample(ParameterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Parameter record);

    int insertSelective(Parameter record);

    List<Parameter> selectByExampleWithBLOBs(ParameterExample example);

    List<Parameter> selectByExample(ParameterExample example);

    Parameter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Parameter record, @Param("example") ParameterExample example);

    int updateByExampleWithBLOBs(@Param("record") Parameter record, @Param("example") ParameterExample example);

    int updateByExample(@Param("record") Parameter record, @Param("example") ParameterExample example);

    int updateByPrimaryKeySelective(Parameter record);

    int updateByPrimaryKeyWithBLOBs(Parameter record);

    int updateByPrimaryKey(Parameter record);
}