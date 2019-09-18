package com.walmart.mapper;

import com.walmart.pojo.Cash;
import com.walmart.pojo.CashExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CashMapper {
    int countByExample(CashExample example);

    int deleteByExample(CashExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Cash record);

    int insertSelective(Cash record);

    List<Cash> selectByExample(CashExample example);

    Cash selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Cash record, @Param("example") CashExample example);

    int updateByExample(@Param("record") Cash record, @Param("example") CashExample example);

    int updateByPrimaryKeySelective(Cash record);

    int updateByPrimaryKey(Cash record);
}