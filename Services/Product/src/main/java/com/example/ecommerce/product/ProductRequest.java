package com.example.ecommerce.product;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
public record ProductRequest(
        Integer id,
        @NotNull(message = "Product Name is required")
        String name,
        @NotNull(message = "Product description is required")
        String description,
        @Positive(message = "Product Available Quantity should be positive")
        Double availableQuantity,
        @Positive(message = "Product Price should be positive")
        BigDecimal price,
        @NotNull(message = "Product categoryId is required")
        Integer category_id
) {
}
