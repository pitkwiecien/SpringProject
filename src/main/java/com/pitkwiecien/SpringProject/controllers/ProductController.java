package com.pitkwiecien.SpringProject.controllers;

import com.pitkwiecien.SpringProject.models.ProductDto;
import com.pitkwiecien.SpringProject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    public ProductRepository productRepository;

    @GetMapping("/api/products")
    public List<ProductDto> showProducts(){
        return productRepository.getProducts();
    }
}
