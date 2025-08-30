package com.example.dream_shop.service.product;

import com.example.dream_shop.entity.Product;
import com.example.dream_shop.model.requests.CreateProductRequest;
import com.example.dream_shop.model.response.ProductResponse;

import java.util.List;

public interface iProductService {
    ProductResponse addProduct(CreateProductRequest product);

    List<Product> getProductList();

    Product getProductById(Long id);

    void updateProduct(Product product, Long id);
    void deleteProduct(Long id);
    List<Product> searchProduct(String name);

    List<Product> getProductByCategory(Long categoryId);

}
