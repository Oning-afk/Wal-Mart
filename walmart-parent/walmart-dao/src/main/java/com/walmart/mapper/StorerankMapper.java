package com.walmart.mapper;

import com.walmart.pojo.Storerank;
import com.walmart.pojo.StorerankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorerankMapper {
    int countByExample(StorerankExample example);

    int deleteByExample(StorerankExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Storerank record);

    int insertSelective(Storerank record);

    List<Storerank> selectByExample(StorerankExample example);

    Storerank selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Storerank record, @Param("example") StorerankExample example);

    int updateByExample(@Param("record") Storerank record, @Param("example") StorerankExample example);

    int updateByPrimaryKeySelective(Storerank record);

    int updateByPrimaryKey(Storerank record);
}