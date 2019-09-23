package com.walmart.mapper;

import com.walmart.pojo.ShippingmethodPaymentmethodExample;
import com.walmart.pojo.ShippingmethodPaymentmethodKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingmethodPaymentmethodMapper {
    int countByExample(ShippingmethodPaymentmethodExample example);

    int deleteByExample(ShippingmethodPaymentmethodExample example);

    int deleteByPrimaryKey(ShippingmethodPaymentmethodKey key);

    int insert(ShippingmethodPaymentmethodKey record);

    int insertSelective(ShippingmethodPaymentmethodKey record);

    List<ShippingmethodPaymentmethodKey> selectByExample(ShippingmethodPaymentmethodExample example);

    int updateByExampleSelective(@Param("record") ShippingmethodPaymentmethodKey record, @Param("example") ShippingmethodPaymentmethodExample example);

    int updateByExample(@Param("record") ShippingmethodPaymentmethodKey record, @Param("example") ShippingmethodPaymentmethodExample example);
}