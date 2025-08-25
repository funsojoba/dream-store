package com.example.dream_shop.service.product;

import com.example.dream_shop.model.Product;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class productController {
    private final iProductService productService;

    public productController(iProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public List<Product> listProducts(){
        return productService.getProductList();
    }
}
