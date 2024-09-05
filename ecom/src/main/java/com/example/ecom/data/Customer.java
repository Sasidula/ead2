package com.example.ecom.data;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")
    private  int customerid;

    @Column(name = "firstName")
    private String customerfirstname;

    @Column(name = "lastName")
    private String customerlastname;

    @Column(name = "adress")
    private String customerAdress;

    @Column(name = "phoneNumber")
    private Integer customerPhoneNumber;

    @Column(name = "password")
    private String customerPassword;

    public String getCustomerAdress() {
        return customerAdress;
    }

    public void setCustomerAdress(String customerAdress) {
        this.customerAdress = customerAdress;
    }

    public Integer getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(Integer customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomerfirstname() {
        return customerfirstname;
    }

    public void setCustomerfirstname(String customerfirstname) {
        this.customerfirstname = customerfirstname;
    }

    public String getCustomerlastname() {
        return customerlastname;
    }

    public void setCustomerlastname(String customerlastname) {
        this.customerlastname = customerlastname;
    }
}
