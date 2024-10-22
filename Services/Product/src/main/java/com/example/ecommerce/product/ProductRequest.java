package com.example.ecommerce.product;
import java.math.BigDecimal;
public record ProductRequest(
        Integer id,
        String name,
        String description,
        Double availableQuantity,
        BigDecimal price,
        Integer category_id
) {
}
