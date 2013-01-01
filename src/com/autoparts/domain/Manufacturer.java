package com.autoparts.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 12-12-29
 * Time: 下午4:56
 * To change this template use File | Settings | File Templates.
 */
public class Manufacturer extends Company {
    private List<ProductCatalog> productCatalogList = new ArrayList<ProductCatalog>();

    public List<ProductCatalog> getProductCatalogList() {
        return productCatalogList;
    }

    public void setProductCatalogList(List<ProductCatalog> productCatalogList) {
        this.productCatalogList = productCatalogList;
    }
}
