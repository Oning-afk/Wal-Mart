package com.walmart.mapper;

import com.walmart.pojo.ProductProducttagExample;
import com.walmart.pojo.ProductProducttagKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductProducttagMapper {
    int countByExample(ProductProducttagExample example);

    int deleteByExample(ProductProducttagExample example);

    int deleteByPrimaryKey(ProductProducttagKey key);

    int insert(ProductProducttagKey record);

    int insertSelective(ProductProducttagKey record);

    List<ProductProducttagKey> selectByExample(ProductProducttagExample example);

    int updateByExampleSelective(@Param("record") ProductProducttagKey record, @Param("example") ProductProducttagExample example);

    int updateByExample(@Param("record") ProductProducttagKey record, @Param("example") ProductProducttagExample example);
}