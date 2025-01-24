package com.nijamrit.SpringBootWebPlay.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nijamrit.SpringBootWebPlay.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
    // Search with JPQL - JPA Query Language, uses Class and fields instead of table and column
    // @Query("query on keyword")
    // Using OR AND LOWER etc we can create complex queries
    @Query("SELECT p from Product p WHERE p.prodName LIKE CONCAT('%', :keyword, '%')")
    List<Product> searchProducts(String keyword);
}
