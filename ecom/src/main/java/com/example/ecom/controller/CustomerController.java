package com.example.ecom.controller;

import com.example.ecom.data.Customer;
import com.example.ecom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/customers/{id}")
    public Customer findCustomerById(@PathVariable("id") int customerid) {
        return customerService.getCustomerById(customerid);
    }

    @PostMapping(path = "/customers")
    public Customer createCustomer(@RequestBody Customer customer){
        return  customerService.createCustomer(customer);
    }

    @PutMapping(path = "/customers")
    public Customer updateUser(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping(path = "/customers/{id}")
    public void deletecustomerById(@PathVariable int id){
        customerService.deleteCustomerById(id);
    }

}
