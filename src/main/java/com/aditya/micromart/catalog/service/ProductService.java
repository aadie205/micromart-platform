package com.aditya.micromart.catalog.service;


import com.aditya.micromart.catalog.dto.ProductRequest;
import com.aditya.micromart.catalog.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse createProduct(ProductRequest request);

    List<ProductResponse> getAllProducts();

    ProductResponse getProductById(Long id);

    void deleteProduct(Long id);
}
