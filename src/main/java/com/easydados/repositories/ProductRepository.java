package com.easydados.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easydados.domain.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    Optional<Product> getProductById(UUID id);
}
