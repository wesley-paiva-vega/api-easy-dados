package com.easydados.dtos;

import com.easydados.domain.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, String email, UserType userType) {

}
