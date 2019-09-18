package com.walmart.mapper;

import com.walmart.pojo.Store;
import com.walmart.pojo.StoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StoreMapper {
    int countByExample(StoreExample example);

    int deleteByExample(StoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Store record);

    int insertSelective(Store record);

    List<Store> selectByExampleWithBLOBs(StoreExample example);

    List<Store> selectByExample(StoreExample example);

    Store selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByExampleWithBLOBs(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKeyWithBLOBs(Store record);

    int updateByPrimaryKey(Store record);
}