package com.walmart.pojo;

import java.io.Serializable;

public class ShippingmethodPaymentmethodKey implements Serializable {
    private Long shippingmethodsId;

    private Long paymentmethodsId;

    public Long getShippingmethodsId() {
        return shippingmethodsId;
    }

    public void setShippingmethodsId(Long shippingmethodsId) {
        this.shippingmethodsId = shippingmethodsId;
    }

    public Long getPaymentmethodsId() {
        return paymentmethodsId;
    }

    public void setPaymentmethodsId(Long paymentmethodsId) {
        this.paymentmethodsId = paymentmethodsId;
    }
}