package com.gmart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmart.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
