package com.aditya.micromart.catalog.dto;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class ProductRequest {

    @NotNull
    private String name;

    private String description;

    @NotNull
    private BigDecimal price;

    @NotNull
    private Long categoryId;
}
