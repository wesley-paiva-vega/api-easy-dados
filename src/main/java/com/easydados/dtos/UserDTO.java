package com.easydados.dtos;

import java.util.Date;

import com.easydados.domain.UserExperience;
import com.easydados.domain.UserType;

public record UserDTO(
        String firstName,
        String lastName,
        String document,
        String email,
        UserType userType,
        UserExperience userExperiences,
        String cpf,
        String country,
        String phoneNumber,
        Date birthDay,
        String landLine) {

}
