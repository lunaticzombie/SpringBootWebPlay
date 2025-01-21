package com.nijamrit.SpringBootWebPlay.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nijamrit.SpringBootWebPlay.model.Product;

// @Service
public class ProductServiceHCD implements ProductServiceProvider {

    public ProductServiceHCD() {
        System.out.println("==================== Using HCD (Hard Coded) Service Provider ====================");
    }

    // Note: Arrays gives an immutable list, so Add product failed.. so changed to ArrayList
    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(101, "iPhone", 2000),
        new Product(102, "Pixel", 1500),
        new Product(103, "Galaxy", 1200)));
    // Later move to ORM tool (Hibernate, Eclipselink etc..) - Object Relational Mapping
    // Using JPA (Spring Data JPA) that provides abstraction on selecting any ORM
    // JPA (Java Persistence API) are standards that ORM implements

    @Override
    public List<Product> getProducts() {
        //System.out.println(products);
        return products;
    }

    @Override
    public Product getProductById(int id) {
        return products.stream()
            .filter(p -> p.getProdId() == id)
            // .findFirst().get();
            .findFirst().orElse(new Product(0, "Product Not Found", 0)); // Not a good way, but still handles invalid Product Id
    }

    @Override
    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }
}
