package com.autoparts.webapp.view;

import com.autoparts.domain.Company;
import com.autoparts.domain.User;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 * User: Administrator
 * Date: 13-1-2
 * Time: 下午9:50
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name="companyView")
@RequestScoped
public class CompanyView extends BaseView {
    Company company = new Company();
    User companyContact = new User();

    @PostConstruct
    public void init(){
        company = this.autopartsService.getCompany();
        companyContact = this.autopartsService.getCompanyContact();
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public User getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(User companyContact) {
        this.companyContact = companyContact;
    }
}
