package com.autoparts.domain;

import java.util.Date;

/**
 * User: Administrator
 * Date: 13-1-1
 * Time: 下午8:11
 * To change this template use File | Settings | File Templates.
 */
public class Order extends PersistenceEntity {
    public static final String COMPANY_NAME="company_name";
    public static final String ADDRESS="address";
    public static final String CONTACT_NAME="contact_name";
    public static final String EMAIL="email_addr";
    public static final String PHONE_NUM="phone_num";
    public static final String FAX_NUM="fax_num";
    public static final String ORDER_CONTENT="order_content";
    public static final String STATUS="status";
    public static final String CREATE_TIME="create_time";
    public static final String UPDATE_TIME="update_time";
    private String companyName;
    private String address;
    private String contactName;
    private String emailAddress;          //must
    private String phoneNumber;
    private String faxNumber;
    private String orderContent;    //must
    private int status;
    private Date createDateTime;
    private Date updateDateTime;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Date getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }
}
