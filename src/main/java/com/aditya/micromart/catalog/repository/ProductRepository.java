package com.aditya.micromart.catalog.repository;

import com.aditya.micromart.catalog.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
