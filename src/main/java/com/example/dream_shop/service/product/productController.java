package com.example.dream_shop.service.product;

import com.example.dream_shop.entity.Product;
import com.example.dream_shop.model.requests.CreateProductRequest;
import com.example.dream_shop.model.response.ProductResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class productController {
    private final iProductService productService;

    public productController(iProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> listProducts(){
        return productService.getProductList();
    }

    @PostMapping()
    public ProductResponse createProduct(@Valid @RequestBody CreateProductRequest productRequest){
        return productService.addProduct(productRequest);
    }
}
