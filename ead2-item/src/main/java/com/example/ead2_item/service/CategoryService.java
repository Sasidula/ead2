package com.example.ead2_item.service;

import com.example.ead2_item.data.Category;
import com.example.ead2_item.data.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(int id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.orElse(null);
    }

    public Category save(Category category) {
        return (Category) categoryRepository.save(category);
    }

    public String deleteById(int id) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
            if (categoryRepository.existsById(id)) {
                return "Category not deleted try again";
            }
            else{
                return "Category deleted";
            }
        }
        else {
            return "Category not found";
        }
    }


}
