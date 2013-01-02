package com.autoparts.service;

import com.autoparts.domain.*;
import com.autoparts.repository.AutopartsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("autopartsService")
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
    public User getCompanyContact() {
        return autopartsRepository.getCompanyContact();
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
        List<ProductCatalog> cataLogList = autopartsRepository.getProductCataLogList();
        Map<String, ProductCatalog> cataLogMap = new HashMap<String, ProductCatalog>();
        for(ProductCatalog item:cataLogList){
            if(item.getParentCatalogCode()==null && !cataLogMap.containsKey(item.getCatalogCode())){
                cataLogMap.put(item.getCatalogCode(),item);
            }
        }

        for(ProductCatalog item:cataLogList){
            if(item.getParentCatalogCode()!=null){
                ProductCatalog parent = cataLogMap.get(item.getParentCatalogCode());
                parent.getChildrenProductCatalogList().add(item);
            }
        }
        List<ProductCatalog> result = new ArrayList<ProductCatalog>();
        for(ProductCatalog value: cataLogMap.values()) {
            result.add(value);
        }
        return result;
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
