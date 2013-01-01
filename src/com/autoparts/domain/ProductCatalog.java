package com.autoparts.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-29
 * Time: 下午4:39
 * To change this template use File | Settings | File Templates.
 */
public class ProductCatalog extends PersistenceEntity {
    public static final String CATALOG_CODE="catalog_code" ;
    public static final String CATALOG_NAME="catalog_name" ;
    public static final String CATALOG_CHINESE_NAME="catalog_name_cn" ;
    public static final String CATALOG_FILE="catalog_file" ;
    public static final String PARENT_CATALOG_CODE="parent_catalog_code" ;
    public static final String CATALOG_DESC="catalog_desc" ;
    private String catalogCode;
    private String catalogName;
    private String catalogChineseName;
    private String catalogDescription;
    private String catalogFileName;
    private String parentCatalogCode;
    private ProductCatalog parentProductCatalog = null;
    private List<ProductCatalog> childrenProductCatalogList = new ArrayList<ProductCatalog>();
    private List<Product> productList = new ArrayList<Product>();

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public List<ProductCatalog> getChildrenProductCatalogList() {
        return childrenProductCatalogList;
    }

    public void setChildrenProductCatalogList(List<ProductCatalog> childrenProductCatalogList) {
        this.childrenProductCatalogList = childrenProductCatalogList;
    }

    public ProductCatalog getParentProductCatalog() {
        return parentProductCatalog;
    }

    public void setParentProductCatalog(ProductCatalog parentProductCatalog) {
        this.parentProductCatalog = parentProductCatalog;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getCatalogChineseName() {
        return catalogChineseName;
    }

    public void setCatalogChineseName(String catalogChineseName) {
        this.catalogChineseName = catalogChineseName;
    }

    public String getCatalogDescription() {
        return catalogDescription;
    }

    public void setCatalogDescription(String catalogDescription) {
        this.catalogDescription = catalogDescription;
    }

    public String getCatalogFileName() {
        return catalogFileName;
    }

    public void setCatalogFileName(String catalogFileName) {
        this.catalogFileName = catalogFileName;
    }

    public String getParentCatalogCode() {
        return parentCatalogCode;
    }

    public void setParentCatalogCode(String parentCatalogCode) {
        this.parentCatalogCode = parentCatalogCode;
    }

    @Override
    public String toString() {
        return "ProductCatalog{" +
                "catalogCode='" + catalogCode + '\'' +
                ", catalogName='" + catalogName + '\'' +
                ", parentProductCatalog=" + parentProductCatalog +
                ", childrenProductCatalogList=" + childrenProductCatalogList +
                '}';
    }
}
