package com.example.ecom.service;

import com.example.ecom.data.CustomerRepository;
import com.example.ecom.data.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CustomerService {

    @Autowired

    private CustomerRepository customerRepository;

    public Customer getCustomerById(int customerId) {
        Optional<Customer> customer = customerRepository.findById(customerId);
        return customer.orElse(null);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomerById(int id) {
        customerRepository.deleteById(id);
    }
}
