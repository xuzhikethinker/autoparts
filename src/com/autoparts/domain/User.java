package com.autoparts.domain;

/**
 * User: Administrator
 * Date: 12-12-31
 * Time: 上午10:52
 * To change this template use File | Settings | File Templates.
 */
public class User extends PersistenceEntity {
    public static final String NAME="user_name";
    public static final String LOGIN_ID="login_id";
    public static final String PASSWORD="password";
    public static final String EMAIL="email";
    public static final String CONTACT_PHONE="contact_phone";
    public static final String MSN_NUM="msn_num";
    public static final String SKYPE_NUM="skype_num";
    public static final String TRADE_MANAGER_NUM="trade_manager_num";
    public static final String FAX_NUM="fax_num";
    public static final String ROLE="role";
    private String name;
    private String loginID;
    private String password;
    private String email;
    private String contactPhone;
    private String msnNumber;
    private String skypeNumber;
    private String tradeManagerNumber;
    private String faxNumber;
    private int role;

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getMsnNumber() {
        return msnNumber;
    }

    public void setMsnNumber(String msnNumber) {
        this.msnNumber = msnNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSkypeNumber() {
        return skypeNumber;
    }

    public void setSkypeNumber(String skypeNumber) {
        this.skypeNumber = skypeNumber;
    }

    public String getTradeManagerNumber() {
        return tradeManagerNumber;
    }

    public void setTradeManagerNumber(String tradeManagerNumber) {
        this.tradeManagerNumber = tradeManagerNumber;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
