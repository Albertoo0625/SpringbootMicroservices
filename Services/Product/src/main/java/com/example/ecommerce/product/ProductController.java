package com.example.ecommerce.product;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<Integer> createProduct(ProductRequest request){
        return ResponseEntity.ok(service.createProduct(request));
    }

    @PostMapping("/purchase")
    public ResponseEntity<List<ProductPurchaseResponse>> purchaseProducts(
           @RequestBody List<ProductPurchaseRequest> request
    ){
        return ResponseEntity.ok(service.purchaseProducts(request));
    }

    @GetMapping("/{product_id}")
    public ResponseEntity<ProductResponse> findById(
            @RequestParam Integer productId
    ){
        return ResponseEntity.ok(service.findById(productId));
    }
}
