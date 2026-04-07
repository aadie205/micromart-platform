package com.aditya.micromart.catalog.repository;

import com.aditya.micromart.catalog.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
