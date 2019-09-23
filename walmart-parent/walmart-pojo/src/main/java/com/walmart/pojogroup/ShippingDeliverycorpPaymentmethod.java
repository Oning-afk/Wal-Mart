package com.walmart.pojogroup;

import com.walmart.pojo.Deliverycorp;
import com.walmart.pojo.PaymentMethod;
import com.walmart.pojo.Shippingmethod;
import com.walmart.pojo.ShippingmethodPaymentmethodKey;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ShippingDeliverycorpPaymentmethod implements Serializable {
    private Shippingmethod shippingmethod;
    private Deliverycorp deliverycorp;
    private List<PaymentMethod> paymentMethod;
    private List<ShippingmethodPaymentmethodKey> shippingmethodPaymentmethodKey;
}
