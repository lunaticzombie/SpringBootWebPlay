package com.nijamrit.SpringBootWebPlay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nijamrit.SpringBootWebPlay.model.Product;
import com.nijamrit.SpringBootWebPlay.service.ProductServiceProvider;

@RestController
@RequestMapping("/api")
@CrossOrigin    // for allowing cross origin resourse sharing, else will get CORS error if layout (lests say React) is serviced from another port or subdomain/domain
public class ProductController {

    @Autowired
    ProductServiceProvider service;

    @RequestMapping("/products")
    public List<Product> getProducts() {
        System.out.println("Sending list of products from Product Controller: " + service.getProducts());
        return service.getProducts();
    }

    // @RequestMapping maps a GET request by deault. to map other types we need to pass additional argument ("/", POST)
    // @RequestMapping("/products/{id}") // better to use dedicated Mapper for specific type
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product prod = service.getProductById(id);
        System.out.println("Sending product from Product Controller: " + prod);
        return new ResponseEntity<>(prod, HttpStatus.OK);
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        System.out.println("Received product (to Add) on Product Controller: " + product);
        return service.addProduct(product);
    }
}
