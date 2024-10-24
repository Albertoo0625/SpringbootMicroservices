package com.example.ecommerce.product;

import jakarta.validation.constraints.NotNull;

public record ProductPurchaseRequest(
        @NotNull(message = "productId is mandatory")
        Integer ProductId,
        @NotNull(message = "product Quantity is mandatory")
        Double quantity
) {
}
