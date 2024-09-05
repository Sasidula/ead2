package com.example.ead2_item.controller;

import com.example.ead2_item.data.Category;
import com.example.ead2_item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.findAll();
    }

    @GetMapping
    public Category getCategoryById(int id) {
        return categoryService.findById(id);
    }

    @PostMapping
    public void addCategory(Category category) {
        categoryService.save(category);
    }

    @PutMapping
    public void updateCategory(Category category) {
        categoryService.save(category);
    }

    @DeleteMapping
    public void deleteCategory(int id) {
        categoryService.deleteById(id);
    }


}
