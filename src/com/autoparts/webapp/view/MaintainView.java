package com.autoparts.webapp.view;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import java.util.ArrayList;

/**
 * User: Administrator
 * Date: 13-1-7
 * Time: 下午9:25
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name="maintainView")
@RequestScoped
public class MaintainView extends BaseView {
    private String pageName="companyEdit";
    private String id;
    @PostConstruct
    public void init() {
        pageName="companyEdit";
    }
    public String gotoPage(String page){
        this.pageName = page;
        System.out.println("this page = "+this.pageName);
        return null;
    }

    public String gotoPage(){
        System.out.println("this page = "+this.pageName);
        return null;
    }

    public void update(ActionEvent actionEvent) {
        actionEvent.getComponent().getClientId();
        System.out.println("Data updated, client id="+actionEvent.getComponent().getClientId());
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        System.out.println("id="+id);
        this.id = id;
    }
}
