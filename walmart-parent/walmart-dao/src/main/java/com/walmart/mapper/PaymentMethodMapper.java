package com.walmart.mapper;

import com.walmart.pojo.PaymentMethod;
import com.walmart.pojo.PaymentMethodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentMethodMapper {
    int countByExample(PaymentMethodExample example);

    int deleteByExample(PaymentMethodExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PaymentMethod record);

    int insertSelective(PaymentMethod record);

    List<PaymentMethod> selectByExampleWithBLOBs(PaymentMethodExample example);

    List<PaymentMethod> selectByExample(PaymentMethodExample example);

    PaymentMethod selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PaymentMethod record, @Param("example") PaymentMethodExample example);

    int updateByExampleWithBLOBs(@Param("record") PaymentMethod record, @Param("example") PaymentMethodExample example);

    int updateByExample(@Param("record") PaymentMethod record, @Param("example") PaymentMethodExample example);

    int updateByPrimaryKeySelective(PaymentMethod record);

    int updateByPrimaryKeyWithBLOBs(PaymentMethod record);

    int updateByPrimaryKey(PaymentMethod record);
}