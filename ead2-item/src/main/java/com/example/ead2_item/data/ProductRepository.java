package com.example.ead2_item.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository<integer> extends JpaRepository<Product,integer> {

    @Query("select p from Product p where p.name=?1")
    public List<Product> findByName(String name);

    @Query("select p from Product p join p.category c where c.categoryName=?1")
    public List<Product> findByCategory(String category);
}
