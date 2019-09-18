package com.walmart.mapper;

import com.walmart.pojo.Businessattribute;
import com.walmart.pojo.BusinessattributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessattributeMapper {
    int countByExample(BusinessattributeExample example);

    int deleteByExample(BusinessattributeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Businessattribute record);

    int insertSelective(Businessattribute record);

    List<Businessattribute> selectByExampleWithBLOBs(BusinessattributeExample example);

    List<Businessattribute> selectByExample(BusinessattributeExample example);

    Businessattribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Businessattribute record, @Param("example") BusinessattributeExample example);

    int updateByExampleWithBLOBs(@Param("record") Businessattribute record, @Param("example") BusinessattributeExample example);

    int updateByExample(@Param("record") Businessattribute record, @Param("example") BusinessattributeExample example);

    int updateByPrimaryKeySelective(Businessattribute record);

    int updateByPrimaryKeyWithBLOBs(Businessattribute record);

    int updateByPrimaryKey(Businessattribute record);
}