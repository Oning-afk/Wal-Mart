package com.walmart.mapper;

import com.walmart.pojo.Specification;
import com.walmart.pojo.SpecificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecificationMapper {
    int countByExample(SpecificationExample example);

    int deleteByExample(SpecificationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Specification record);

    int insertSelective(Specification record);

    List<Specification> selectByExampleWithBLOBs(SpecificationExample example);

    List<Specification> selectByExample(SpecificationExample example);

    Specification selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Specification record, @Param("example") SpecificationExample example);

    int updateByExampleWithBLOBs(@Param("record") Specification record, @Param("example") SpecificationExample example);

    int updateByExample(@Param("record") Specification record, @Param("example") SpecificationExample example);

    int updateByPrimaryKeySelective(Specification record);

    int updateByPrimaryKeyWithBLOBs(Specification record);

    int updateByPrimaryKey(Specification record);
}