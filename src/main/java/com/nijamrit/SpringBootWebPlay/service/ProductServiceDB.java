package com.nijamrit.SpringBootWebPlay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nijamrit.SpringBootWebPlay.model.Product;
import com.nijamrit.SpringBootWebPlay.repo.ProductRepo;

@Service
public class ProductServiceDB implements ProductServiceProvider {

    @Autowired
    ProductRepo repo;

    public ProductServiceDB() {
        System.out.println("==================== Using DB (Database) Service Provider ====================");
    }

    @Override
    public Product addProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product(0, "Product Not Found", 0));
    }

    @Override
    public List<Product> getProducts() {
        return repo.findAll();
    }

}
