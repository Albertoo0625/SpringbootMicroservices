package com.example.ecommerce.product;

import com.example.ecommerce.category.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductMapper {
    public Product toProduct(ProductRequest request) {
      return Product.builder()
              .id(request.id())
              .name(request.name())
              .description(request.description())
              .availableQuantity(request.availableQuantity())
              .price(request.price())
              .category(
                      Category.builder()
                              .id(request.id()).build()
              )
              .build();
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getAvailableQuantity(),
                product.getPrice(),
                product.getCategory().getId(),
                product.getCategory().getName(),
                product.getDescription()
        );
    }

    public ProductPurchaseResponse toPurchaseProductResponse(Product product, Double quantity) {
       return new ProductPurchaseResponse(
               product.getId(),
               product.getName(),
               product.getDescription(),
               product.getPrice(),
               quantity
       );
    }
}
