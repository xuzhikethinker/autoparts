package com.autoparts.domain;

/**
 * User: Administrator
 * Date: 12-12-29
 * Time: 下午4:53
 * To change this template use File | Settings | File Templates.
 */
public class Product extends PersistenceEntity {
    private String productName;
    private String productCode;
    private String catalogCode;
    private String detailInfo;

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    public String getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
