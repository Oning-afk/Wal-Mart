package com.walmart.mapper;

import com.walmart.pojo.Producttag;
import com.walmart.pojo.ProducttagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProducttagMapper {
    int countByExample(ProducttagExample example);

    int deleteByExample(ProducttagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Producttag record);

    int insertSelective(Producttag record);

    List<Producttag> selectByExample(ProducttagExample example);

    Producttag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Producttag record, @Param("example") ProducttagExample example);

    int updateByExample(@Param("record") Producttag record, @Param("example") ProducttagExample example);

    int updateByPrimaryKeySelective(Producttag record);

    int updateByPrimaryKey(Producttag record);
}