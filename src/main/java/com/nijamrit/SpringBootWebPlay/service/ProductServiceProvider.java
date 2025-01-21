package com.nijamrit.SpringBootWebPlay.service;

import java.util.List;

import com.nijamrit.SpringBootWebPlay.model.Product;

public interface ProductServiceProvider {

    List<Product> getProducts();

    Product getProductById(int id);

    Product addProduct(Product product);

}