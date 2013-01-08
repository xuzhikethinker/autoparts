package com.autoparts.webapp.view;

import com.autoparts.service.AutopartsService;

import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-1-2
 * Time: 下午9:24
 * To change this template use File | Settings | File Templates.
 */
public class BaseView {
    @ManagedProperty(value="#{autopartsService}")  //injecting spring bean
    protected AutopartsService autopartsService;

    public AutopartsService getAutopartsService() {
        return autopartsService;
    }

    public void setAutopartsService(AutopartsService autopartsService) {
        this.autopartsService = autopartsService;
    }

    public ServletContext getServletContext(){
        return (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
    }

    public String getParamValue(String paramName){
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
        return params.get(paramName);
    }


}
