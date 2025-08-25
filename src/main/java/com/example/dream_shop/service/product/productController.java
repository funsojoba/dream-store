package com.example.dream_shop.service.product;

import com.example.dream_shop.model.Product;
import jakarta.websocket.server.PathParam;
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
    public Product createProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
}
