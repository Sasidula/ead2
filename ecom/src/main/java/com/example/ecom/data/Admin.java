package com.example.ecom.data;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adminId")
    private  int adminId;

    @Column(name = "firstName")
    private String adminfirstname;

    @Column(name = "lastName")
    private String adminlastname;

    @Column(name = "phoneNumber")
    private Integer adminPhoneNumber;

    @Column(name = "password")
    private String adminPassword;

    public Integer getAdminPhoneNumber() {
        return adminPhoneNumber;
    }

    public void setAdminPhoneNumber(Integer adminPhoneNumber) {
        this.adminPhoneNumber = adminPhoneNumber;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminfirstname() {
        return adminfirstname;
    }

    public void setAdminfirstname(String adminfirstname) {
        this.adminfirstname = adminfirstname;
    }

    public String getAdminlastname() {
        return adminlastname;
    }

    public void setAdminlastname(String adminlastname) {
        this.adminlastname = adminlastname;
    }
}
