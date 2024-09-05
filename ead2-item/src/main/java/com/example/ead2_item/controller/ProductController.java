package com.example.ead2_item.controller;

import com.example.ead2_item.data.Product;
import com.example.ead2_item.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping
    public Product getProductById(int id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    @PutMapping
    public void updateProduct(Product product) {
        productService.updateProduct(product);
    }

    @DeleteMapping
    public void deleteProduct(int id) {

        productService.deleteProduct(id);
    }

    @GetMapping
    public Product getProductsByCategory(String category) {
        return productService.getProductByCategory(category);
    }

    @GetMapping
    public Product getProductsByName(String name) {
        return productService.getProductByName(name);
    }

}
