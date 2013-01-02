package com.autoparts.repository;

import com.autoparts.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Repository("autopartsRepository")
public class AutopartsRepositoryImpl extends JdbcDaoSupport implements AutopartsRepository {
    @Autowired
    DataSource dataSource;

    @PostConstruct
    public void setJdbcTemplateDataSource(){
        this.setDataSource(dataSource);
    }
    @Override
    public void updateUser(final User user) {
        //"update ap_user set user_name=?,password=?,role=?,email=?,contact_phone=?,msn_num=?,skype_num=?,trade_manager_num=?,fax_num=? where id=? ";
        int count = this.getJdbcTemplate().update(AutopartsSQLConstant.UPDATE_USER,new PreparedStatementSetter(){
            public void setValues(PreparedStatement ps) throws SQLException{
                 ps.setString(1,user.getName());
                ps.setString(2,user.getPassword());
                ps.setInt(3, user.getRole());
                ps.setString(4,user.getEmail());
                ps.setString(5,user.getContactPhone());
                ps.setString(6,user.getMsnNumber());
                ps.setString(7,user.getSkypeNumber());
                ps.setString(8,user.getTradeManagerNumber());
                ps.setString(9,user.getFaxNumber());
                ps.setLong(10,user.getId());
            }
        });
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public User getAdmin(User user) {
        User userFromDB = this.getJdbcTemplate().queryForObject(AutopartsSQLConstant.SELECT_USER_BY_LOGIN_CODE, new Object[]{user.getLoginID(), user.getPassword(), 1}, new RowMapper<User>() {
            public User mapRow(ResultSet rs, int index) throws SQLException {
                User result = new User();
                result.setId(rs.getLong(PersistenceEntity.ID));
                result.setContactPhone(rs.getString(User.CONTACT_PHONE));
                result.setEmail(rs.getString(User.EMAIL));
                result.setFaxNumber(rs.getString(User.FAX_NUM));
                result.setLoginID(rs.getString(User.LOGIN_ID));
                result.setMsnNumber(rs.getString(User.MSN_NUM));
                result.setName(rs.getString(User.NAME));
                result.setPassword(rs.getString(User.PASSWORD));
                result.setRole(rs.getInt(User.ROLE));
                result.setSkypeNumber(rs.getString(User.SKYPE_NUM));
                result.setTradeManagerNumber(rs.getString(User.TRADE_MANAGER_NUM));
                return result;
            }
        }
        );
        return userFromDB;
    }

    public User getCompanyContact(){
        User userFromDB = this.getJdbcTemplate().queryForObject(AutopartsSQLConstant.SELECT_COMP_CONTACT,  new RowMapper<User>() {
            public User mapRow(ResultSet rs, int index) throws SQLException {
                User result = new User();
                result.setId(rs.getLong(PersistenceEntity.ID));
                result.setContactPhone(rs.getString(User.CONTACT_PHONE));
                result.setEmail(rs.getString(User.EMAIL));
                result.setFaxNumber(rs.getString(User.FAX_NUM));
                result.setLoginID(rs.getString(User.LOGIN_ID));
                result.setMsnNumber(rs.getString(User.MSN_NUM));
                result.setName(rs.getString(User.NAME));
                result.setPassword(rs.getString(User.PASSWORD));
                result.setRole(rs.getInt(User.ROLE));
                result.setSkypeNumber(rs.getString(User.SKYPE_NUM));
                result.setTradeManagerNumber(rs.getString(User.TRADE_MANAGER_NUM));
                return result;
            }
        }
        );
        return userFromDB;
    }

    @Override
    public void updateCompany(final Company company) {
        //"update ap_company set comp_name=?,comp_address=?,comp_principal=?,comp_introduction=?,email_addr=?,contact_name=?,phone_num=?,fax_num=? where id=? ";
        int count = this.getJdbcTemplate().update(AutopartsSQLConstant.UPDATE_COMPANY,new PreparedStatementSetter(){
            public void setValues(PreparedStatement ps) throws SQLException{
                ps.setString(1, company.getName());
                ps.setString(2, company.getAddress());
                ps.setString(3, company.getPrincipal());
                ps.setString(4, company.getBriefIntroduction());
                ps.setString(5, company.getContact().getEmailAddress());
                ps.setString(6, company.getContact().getContactName());
                ps.setString(7, company.getContact().getPhone());
                ps.setString(8,company.getContact().getFax());
                ps.setLong(9,company.getId());
            }
        });
    }

    @Override
    public Company getCompany() {
        Company company = this.getJdbcTemplate().queryForObject(AutopartsSQLConstant.SELECT_COMPANY, null, new RowMapper<Company>() {
            public Company mapRow(ResultSet rs, int index) throws SQLException {
                Company result = new Company();
                result.setId(rs.getLong(PersistenceEntity.ID));
                result.setAddress(rs.getString(Company.ADDRESS));
                result.setBriefIntroduction(rs.getString(Company.INTRODUCTION));
                Contact contact = new  Contact();
                contact.setContactName(rs.getString(Contact.CONTACT_NAME));
                contact.setEmailAddress(rs.getString(Contact.EMAIL));
                contact.setFax(rs.getString(Contact.FAX_NUM));
                contact.setPhone(rs.getString(Contact.PHONE_NUM));
                result.setContact(contact);
                result.setName(rs.getString(Company.NAME));
                result.setPrincipal(rs.getString(Company.PRINCIPAL));
                return result;
            }
        }
        );
        return company;
    }

    @Override
    public void saveContact(Contact contact) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void saveProduct(Product product) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void saveProductCatalog(ProductCatalog productCatalog) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<ProductCatalog> getProductCataLogList() {
        List<ProductCatalog> catalogs = this.getJdbcTemplate().query(AutopartsSQLConstant.SELECT_PRODUCT_CATALOG_LIST,  new RowMapper<ProductCatalog>() {
            public ProductCatalog mapRow(ResultSet rs, int index) throws SQLException {
                ProductCatalog result = new ProductCatalog();
                result.setId(rs.getLong(PersistenceEntity.ID));
                result.setCatalogChineseName(rs.getString(ProductCatalog.CATALOG_CHINESE_NAME));
                result.setCatalogCode(rs.getString(ProductCatalog.CATALOG_CODE));
                result.setCatalogDescription(rs.getString(ProductCatalog.CATALOG_DESC));
                result.setCatalogFileName(rs.getString(ProductCatalog.CATALOG_FILE));
                result.setCatalogName(rs.getString(ProductCatalog.CATALOG_NAME));
                result.setParentCatalogCode(rs.getString(ProductCatalog.PARENT_CATALOG_CODE));
                return result;
            }
        }
        );
        return catalogs;
    }

    @Override
    public List<Order> getOrderList() {
        List<Order> orders = this.getJdbcTemplate().query(AutopartsSQLConstant.SELECT_ORDER_LIST,  new RowMapper<Order>() {
            public Order mapRow(ResultSet rs, int index) throws SQLException {
                Order result = new Order();
                result.setId(rs.getLong(PersistenceEntity.ID));
                result.setAddress(rs.getString(Order.ADDRESS));
                result.setCompanyName(rs.getString(Order.COMPANY_NAME));
                result.setContactName(rs.getString(Order.CONTACT_NAME));
                result.setEmailAddress(rs.getString(Order.EMAIL));
                result.setFaxNumber(rs.getString(Order.FAX_NUM));
                result.setOrderContent(rs.getString(Order.ORDER_CONTENT));
                result.setPhoneNumber(rs.getString(Order.PHONE_NUM));
                result.setStatus(rs.getInt(Order.STATUS));
                result.setCreateDateTime(rs.getDate(Order.CREATE_TIME));
                result.setUpdateDateTime(rs.getDate(Order.UPDATE_TIME));
                return result;
            }
        }
        );
        return orders;
    }

    @Override
    public int addOrder(final Order order) {
        //ap_order(company_name,address,contact_name,email_addr,phone_num,fax_num,order_content,create_time)
        int count = this.getJdbcTemplate().update(AutopartsSQLConstant.ADD_ORDER,new PreparedStatementSetter(){
            public void setValues(PreparedStatement ps) throws SQLException{
                ps.setString(1, order.getCompanyName());
                ps.setString(2, order.getAddress());
                ps.setString(3, order.getContactName());
                ps.setString(4, order.getEmailAddress());
                ps.setString(5, order.getPhoneNumber());
                ps.setString(6, order.getFaxNumber());
                ps.setString(7, order.getOrderContent());
                ps.setDate(8, (java.sql.Date) new Date());
            }
        });
        return count;
    }

    @Override
    public int updateOrderStatusByID(final Long id) {
        int count = this.getJdbcTemplate().update(AutopartsSQLConstant.UPDATE_ORDER_STATUS,new PreparedStatementSetter(){
            public void setValues(PreparedStatement ps) throws SQLException{
                ps.setLong(1,id);
            }
        });
        return count;
    }
}
