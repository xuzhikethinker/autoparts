package com.autoparts.webapp.view;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 13-1-1
 * Time: 上午11:06
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name="homeView")
@SessionScoped
public class HomeView {
    private List<String> productImages;

    @PostConstruct
    public void init() {
        productImages = new ArrayList<String>();
        for (int i = 1; i <= 12; i++) {
            productImages.add("galleria" + i + ".jpg");
        }
    }

    public List<String> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<String> productImages) {
        this.productImages = productImages;
    }
}
