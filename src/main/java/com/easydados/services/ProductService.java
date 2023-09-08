package com.easydados.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easydados.domain.Product;
import com.easydados.dtos.ProductDTO;
import com.easydados.repositories.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }

    public void saveProduct(Product product) { this.productRepository.save(product); }

    public Product createProduct(ProductDTO product) {
        Product newProduct = new Product(product);
        this.saveProduct(newProduct);
        return newProduct;
    }
}
