package com.walmart.pojo;

import java.io.Serializable;

public class AttributeAndProductCategoryBeanMapper implements Serializable {
    private Attribute attribute;

    private ProductCategoryBean productCategoryBean;

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public ProductCategoryBean getProductCategoryBean() {
        return productCategoryBean;
    }

    public void setProductCategoryBean(ProductCategoryBean productCategoryBean) {
        this.productCategoryBean = productCategoryBean;
    }

    @Override
    public String toString() {
        return "AttributeAndProductCategoryBeanMapper{" +
                "attribute=" + attribute +
                ", productCategoryBean=" + productCategoryBean +
                '}';
    }
}
