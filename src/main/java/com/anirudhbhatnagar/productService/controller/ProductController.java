package com.anirudhbhatnagar.productService.controller;

import com.anirudhbhatnagar.productService.domain.Product;
import com.anirudhbhatnagar.productService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping //("/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long id) {
        return productRepository.findById(id).orElse(null);
    }
    @PostMapping//("/products")
    public Product save(@RequestBody Product product) {
        return productRepository.save(product);
    }
}