package com.example.dream_shop.model.requests;

import com.example.dream_shop.entity.Category;
import com.example.dream_shop.entity.Image;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;


@Data
public class CreateProductRequest {
    @NotBlank(message = "Name is required")
    private String name;

    private String brand;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be greater than zero")
    private BigDecimal price;


    private int inventory;
    private String description;

    private Long categoryId;


//    private List<Image> images;
}
