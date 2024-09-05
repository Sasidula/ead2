package com.example.ecom.service;

import com.example.ecom.data.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public void deleteCustomerById(int id) {
        adminRepository.deleteById(id);
    }
}
