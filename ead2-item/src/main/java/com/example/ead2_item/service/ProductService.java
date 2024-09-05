package com.example.ead2_item.service;

import com.example.ead2_item.data.Product;
import com.example.ead2_item.data.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            return product.get();
        }
        return null;
    }

    public Product addProduct(Product product) {
        return (Product) productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return (Product) productRepository.save(product);
    }

    public String deleteProduct(int id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            if (productRepository.existsById(id)) {
                return "Product not deleted try again";
            }
            else {
                return "Product deleted";
            }
        }
        else{
            return "Product not found";
        }
    }

    public Product getProductByName(String name) {
        return (Product) productRepository.findByName(name);
    }

    public Product getProductByCategory(String category) {
        return (Product) productRepository.findByCategory(category);
    }


}
