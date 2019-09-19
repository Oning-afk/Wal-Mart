package com.walmart.pojogroup;

import com.walmart.pojo.Parameter;
import com.walmart.pojo.Productcategory;
import lombok.Data;

import java.io.Serializable;

@Data
public class Parameterandproductcat implements Serializable {
    private Parameter parameter;
    private Productcategory productcategory;

    public Parameterandproductcat() {
    }

    public Parameterandproductcat(Parameter parameter, Productcategory productcategory) {
        this.parameter = parameter;
        this.productcategory = productcategory;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    public Productcategory getProductcategory() {
        return productcategory;
    }

    public void setProductcategory(Productcategory productcategory) {
        this.productcategory = productcategory;
    }

    @Override
    public String toString() {
        return "Parameterandproductcat{" +
                "parameter=" + parameter +
                ", productcategory=" + productcategory +
                '}';
    }
}
