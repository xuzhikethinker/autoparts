package com.autoparts.webapp.view;

import com.autoparts.domain.ProductCatalog;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 13-1-2
 * Time: 下午9:47
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name="productView")
@SessionScoped
public class ProductView extends BaseView {
    List<ProductCatalog> productCatalogList = new ArrayList<ProductCatalog>();
    private TreeNode root;
    private TreeNode selectedNode;

    @PostConstruct
    public void init(){
        productCatalogList = this.autopartsService.getProductCataLogList();
        root = new DefaultTreeNode("Root", null);
        for(ProductCatalog parent:productCatalogList){
            TreeNode parentNode = new DefaultTreeNode(parent.getCatalogName(), root);
            for(ProductCatalog child: parent.getChildrenProductCatalogList()){
                new DefaultTreeNode(child.getCatalogName(), parentNode);
            }
        }
    }

    public List<ProductCatalog> getProductCatalogList() {
        return productCatalogList;
    }

    public void setProductCatalogList(List<ProductCatalog> productCatalogList) {
        this.productCatalogList = productCatalogList;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(TreeNode selectedNode) {
        this.selectedNode = selectedNode;
    }
}
