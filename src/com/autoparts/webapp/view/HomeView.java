package com.autoparts.webapp.view;

import com.autoparts.domain.Company;

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
public class HomeView extends BaseView {
    private List<String> productImages;
    private Company company;
    @PostConstruct
    public void init() {
        company = autopartsService.getCompany();
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
