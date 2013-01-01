package com.autoparts.service;

import com.autoparts.domain.*;
import com.autoparts.repository.AutopartsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class AutopartsServiceImpl implements AutopartsService {
    @Autowired
    AutopartsRepository autopartsRepository;

    @Override
    public void updateUser(User user) {
        autopartsRepository.updateUser(user);
    }

    @Override
    public User getAdmin(User user) {
        return autopartsRepository.getAdmin(user);
    }

    @Override
    public void updateCompany(Company company) {
        autopartsRepository.updateCompany(company);
    }

    @Override
    public Company getCompany() {
        return autopartsRepository.getCompany();
    }

    @Override
    public void saveContact(Contact contact) {
        autopartsRepository.saveContact(contact);
    }

    @Override
    public void saveProduct(Product product) {
        autopartsRepository.saveProduct(product);
    }

    @Override
    public void saveProductCatalog(ProductCatalog productCatalog) {
        autopartsRepository.saveProductCatalog(productCatalog);
    }

    @Override
    public List<ProductCatalog> getProductCataLogList() {
        return autopartsRepository.getProductCataLogList();
    }

    @Override
    public List<Order> getOrderList() {
        return autopartsRepository.getOrderList();
    }

    @Override
    public int addOrder(Order order) {
        return autopartsRepository.addOrder(order);
    }

    @Override
    public int updateOrderStatusByID(Long id) {
        return autopartsRepository.updateOrderStatusByID(id);
    }
}
