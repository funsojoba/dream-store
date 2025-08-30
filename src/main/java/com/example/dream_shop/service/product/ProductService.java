package com.example.dream_shop.service.product;

import com.example.dream_shop.entity.Product;
import com.example.dream_shop.model.requests.CreateProductRequest;
import com.example.dream_shop.model.response.ProductResponse;
import com.example.dream_shop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.lang.Long;


@Service
public class ProductService implements iProductService{
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductResponse addProduct(CreateProductRequest request) {
        Product product = new Product();

        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setBrand(request.getBrand());

        Product savedProduct = productRepository.save(product);

        return new ProductResponse(
                savedProduct.getId(),
                savedProduct.getName(),
                savedProduct.getBrand(),
                savedProduct.getPrice(),
                savedProduct.getDescription());
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
