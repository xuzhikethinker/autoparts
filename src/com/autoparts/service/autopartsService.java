package com.autoparts.service;

import com.autoparts.domain.*;

import java.util.List;

/**
 * User: Administrator
 * Date: 12-12-31
 * Time: 下午5:12
 * To change this template use File | Settings | File Templates.
 */
public interface AutopartsService {
    void updateUser(User user);
    User getAdmin(User user);
    User getCompanyContact();

    void updateCompany(Company company);
    Company getCompany();

    void saveContact(Contact contact);

    void saveProduct(Product product);

    void saveProductCatalog(ProductCatalog productCatalog);
    List<ProductCatalog> getProductCataLogList();

    List<Order> getOrderList();
    int addOrder(Order order);
    int updateOrderStatusByID(Long id);
}
