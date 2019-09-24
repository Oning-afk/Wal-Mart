package com.walmart.mapper;

import com.walmart.pojo.Memberattribute;
import com.walmart.pojo.MemberattributeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberattributeMapper {
    int countByExample(MemberattributeExample example);

    int deleteByExample(MemberattributeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Memberattribute record);

    int insertSelective(Memberattribute record);

    List<Memberattribute> selectByExampleWithBLOBs(MemberattributeExample example);

    List<Memberattribute> selectByExample(MemberattributeExample example);

    Memberattribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Memberattribute record, @Param("example") MemberattributeExample example);

    int updateByExampleWithBLOBs(@Param("record") Memberattribute record, @Param("example") MemberattributeExample example);

    int updateByExample(@Param("record") Memberattribute record, @Param("example") MemberattributeExample example);

    int updateByPrimaryKeySelective(Memberattribute record);

    int updateByPrimaryKeyWithBLOBs(Memberattribute record);

    int updateByPrimaryKey(Memberattribute record);
}