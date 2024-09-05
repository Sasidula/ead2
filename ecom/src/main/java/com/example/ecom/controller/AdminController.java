package com.example.ecom.controller;

import com.example.ecom.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService ;

    @DeleteMapping(path = "/customers/{id}")
    public void deletecustomerById(@PathVariable int id){
        adminService.deleteCustomerById(id);
    }

}
