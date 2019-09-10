package com.walmart.pojo;

public class ProductWithBLOBs extends Product {
    private String introduction;

    private String parametervalues;

    private String productimages;

    private String specificationitems;

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getParametervalues() {
        return parametervalues;
    }

    public void setParametervalues(String parametervalues) {
        this.parametervalues = parametervalues == null ? null : parametervalues.trim();
    }

    public String getProductimages() {
        return productimages;
    }

    public void setProductimages(String productimages) {
        this.productimages = productimages == null ? null : productimages.trim();
    }

    public String getSpecificationitems() {
        return specificationitems;
    }

    public void setSpecificationitems(String specificationitems) {
        this.specificationitems = specificationitems == null ? null : specificationitems.trim();
    }
}