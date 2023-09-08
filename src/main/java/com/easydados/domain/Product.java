package com.easydados.domain;

import java.util.UUID;

import com.easydados.dtos.ProductDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Entity(name = "products")
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")

public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private Float price;

    @Enumerated(EnumType.STRING)
    private CategoryType category;

    public Product(ProductDTO data) {
        this.name = data.name();
        this.price = data.price();
        this.category = data.category();
    }

}
