package com.easydados.dtos;

import com.easydados.domain.CategoryType;

public record ProductDTO(String name, Float price, CategoryType category) {
    
}
