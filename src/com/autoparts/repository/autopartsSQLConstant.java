package com.autoparts.repository;

/**
 * User: Administrator
 * Date: 13-1-1
 * Time: 下午8:50
 * To change this template use File | Settings | File Templates.
 */
public interface AutopartsSQLConstant {
    public static final String SELECT_COMPANY = "select * from ap_company";
    public static final String SELECT_PRODUCT_CATALOG_LIST = "select * from ap_product_catalog";
    public static final String SELECT_ORDER_LIST = "select * from ap_order";
    public static final String SELECT_USER_BY_LOGIN_CODE = "select * from ap_user where login_id=? and password=? and role=?";
    public static final String SELECT_COMP_CONTACT = "select * from ap_user where comp_contact=1";

    public static final String UPDATE_USER = "update ap_user set user_name=?,password=?,role=?,email=?,contact_phone=?,msn_num=?,skype_num=?,trade_manager_num=?,fax_num=? where id=? ";
    public static final String UPDATE_COMPANY = "update ap_company set comp_name=?,comp_address=?,comp_principal=?,comp_introduction=?,email_addr=?,contact_name=?,phone_num=?,fax_num=? where id=? ";
    public static final String ADD_ORDER = "insert into ap_order(company_name,address,contact_name,email_addr,phone_num,fax_num,order_content,create_time) values (?,?,?,?,?,?,?,?)";
    public static final String UPDATE_ORDER_STATUS="update ap_order set status=1 where id=?";

}
