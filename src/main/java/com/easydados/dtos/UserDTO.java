package com.easydados.dtos;

import com.easydados.domain.UserExperience;
import com.easydados.domain.UserType;


public record UserDTO(String firstName, String lastName, String document, String email, UserType userType, UserExperience userExperiences) {

}
