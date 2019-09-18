package com.walmart.mapper;

import com.walmart.pojo.Deliverycorp;
import com.walmart.pojo.DeliverycorpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverycorpMapper {
    int countByExample(DeliverycorpExample example);

    int deleteByExample(DeliverycorpExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Deliverycorp record);

    int insertSelective(Deliverycorp record);

    List<Deliverycorp> selectByExample(DeliverycorpExample example);

    Deliverycorp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Deliverycorp record, @Param("example") DeliverycorpExample example);

    int updateByExample(@Param("record") Deliverycorp record, @Param("example") DeliverycorpExample example);

    int updateByPrimaryKeySelective(Deliverycorp record);

    int updateByPrimaryKey(Deliverycorp record);
}