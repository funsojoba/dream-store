package com.example.dream_shop.service.product;

import com.example.dream_shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.lang.Long;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    Product getProductById(Long productId);

    List<Product> findByPriceBetween(BigDecimal min, BigDecimal max);
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findByName(String productName);
}
