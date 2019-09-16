package com.walmart.mapper;

import com.walmart.pojo.Memberrank;
import com.walmart.pojo.MemberrankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberrankMapper {
    int countByExample(MemberrankExample example);

    int deleteByExample(MemberrankExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Memberrank record);

    int insertSelective(Memberrank record);

    List<Memberrank> selectByExample(MemberrankExample example);

    Memberrank selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Memberrank record, @Param("example") MemberrankExample example);

    int updateByExample(@Param("record") Memberrank record, @Param("example") MemberrankExample example);

    int updateByPrimaryKeySelective(Memberrank record);

    int updateByPrimaryKey(Memberrank record);
}