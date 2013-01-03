package com.autoparts.webapp.view;

import com.autoparts.domain.ProductCatalog;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.primefaces.model.UploadedFile;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import javax.servlet.ServletContext;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 13-1-2
 * Time: 下午9:47
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name="productView")
@RequestScoped
public class ProductView extends BaseView {
    List<ProductCatalog> productCatalogList = new ArrayList<ProductCatalog>();
    private TreeNode root;
    private TreeNode selectedNode;
    private String selectedPDFName="guide.pdf";
    private static final String UPLOAD_FOLDER = "resources"+File.separator+"product";
    private UploadedFile file;
    private String fileDesc;

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

    public void fileUpload(FileUploadEvent event) {
        if (!PhaseId.INVOKE_APPLICATION.equals(event.getPhaseId())) {
            event.setPhaseId(PhaseId.INVOKE_APPLICATION);
            event.queue();
        } else {
            this.file = event.getFile();
            upload();
            System.out.println("Description====="+this.fileDesc);
            //do stuff here, #{ngoPhotoBean.description} is set
        }
    }

    public void upload() {
        if(file != null) {
            try {
                String folder = getServletContext().getRealPath("/")+UPLOAD_FOLDER;
                InputStream in = file.getInputstream();
                BufferedInputStream bis = new BufferedInputStream(in);
                FileOutputStream fos= new FileOutputStream(folder+File.separator+file.getFileName());
                byte[] buf = new byte[1024];
                int size = 0;
                while ( (size = bis.read(buf)) != -1)
                    fos.write(buf, 0, size);
                fos.close();
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }
    public String popupPDF(String type){

        ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
        System.out.println(servletContext.getRealPath("/"));
        servletContext.getContextPath();
        servletContext.getContext("path");
        this.selectedPDFName="neview.pdf";
        return null;
    }

    public String popupPDF(){
        this.selectedPDFName="neview.pdf";
        return null;
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

    public String getSelectedPDFName() {
        return selectedPDFName;
    }

    public void setSelectedPDFName(String selectedPDFName) {
        this.selectedPDFName = selectedPDFName;
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public String getFileDesc() {
        return fileDesc;
    }

    public void setFileDesc(String fileDesc) {
        this.fileDesc = fileDesc;
    }
}
