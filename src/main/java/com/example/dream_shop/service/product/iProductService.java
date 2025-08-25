package com.example.dream_shop.service.product;

import com.example.dream_shop.model.Product;

import java.util.List;

public interface iProductService {
    Product addProduct(Product product);

    List<Product> getProductList();

    Product getProductById(Long id);

    void updateProduct(Product product, Long id);
    void deleteProduct(Long id);
    List<Product> searchProduct(String name);

    List<Product> getProductByCategory(Long categoryId);

}
