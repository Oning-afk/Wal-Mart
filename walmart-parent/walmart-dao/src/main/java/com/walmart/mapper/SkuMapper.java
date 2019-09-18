package com.walmart.mapper;

import com.walmart.pojo.Sku;
import com.walmart.pojo.SkuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SkuMapper {
    int countByExample(SkuExample example);

    int deleteByExample(SkuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Sku record);

    int insertSelective(Sku record);

    List<Sku> selectByExampleWithBLOBs(SkuExample example);

    List<Sku> selectByExample(SkuExample example);

    Sku selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Sku record, @Param("example") SkuExample example);

    int updateByExampleWithBLOBs(@Param("record") Sku record, @Param("example") SkuExample example);

    int updateByExample(@Param("record") Sku record, @Param("example") SkuExample example);

    int updateByPrimaryKeySelective(Sku record);

    int updateByPrimaryKeyWithBLOBs(Sku record);

    int updateByPrimaryKey(Sku record);
}