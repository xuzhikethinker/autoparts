package com.autoparts.domain;


public class Company extends PersistenceEntity {
    public static final String NAME="comp_name" ;
    public static final String ADDRESS="comp_address" ;
    public static final String PRINCIPAL="comp_principal" ;
    public static final String INTRODUCTION="comp_introduction" ;
    private String name;
    private String address;
    private String  principal;
    private String  briefIntroduction;
    private Contact contact;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBriefIntroduction() {
        return briefIntroduction;
    }

    public void setBriefIntroduction(String briefIntroduction) {
        this.briefIntroduction = briefIntroduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    @Override
    public String toString() {
        return "Company{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", principal='" + principal + '\'' +
                ", briefIntroduction='" + briefIntroduction + '\'' +
                ", contact=" + contact +
                '}';
    }
}
