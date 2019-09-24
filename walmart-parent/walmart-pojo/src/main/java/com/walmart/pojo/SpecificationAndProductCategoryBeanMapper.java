package com.walmart.pojo;

import java.io.Serializable;

public class SpecificationAndProductCategoryBeanMapper implements Serializable {
    private Specification specification;

    private ProductCategoryBean productCategoryBean;

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public ProductCategoryBean getProductCategoryBean() {
        return productCategoryBean;
    }

    public void setProductCategoryBean(ProductCategoryBean productCategoryBean) {
        this.productCategoryBean = productCategoryBean;
    }

    @Override
    public String toString() {
        return "SpecificationAndProductCategoryBeanMapper{" +
                "specification=" + specification +
                ", productCategoryBean=" + productCategoryBean +
                '}';
    }
}
