package com.example.dream_shop.service.product;

import com.example.dream_shop.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.lang.Long;


@Service
public class ProductService implements iProductService{
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private final ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);

    }

    @Override
    public List<Product> getProductList() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long productId) {
      return productRepository.getProductById(productId);
    };

    @Override
    public void updateProduct(Product product, Long id) {

    }

    @Override
    public void deleteProduct(Long id) {

    }

    @Override
    public List<Product> searchProduct(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductByCategory(Long categoryId) {
        return List.of();
    }
}
