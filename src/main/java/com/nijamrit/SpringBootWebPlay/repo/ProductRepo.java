package com.nijamrit.SpringBootWebPlay.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nijamrit.SpringBootWebPlay.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
