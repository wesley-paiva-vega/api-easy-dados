package com.easydados.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easydados.domain.UserExperience;
import com.easydados.dtos.UserExperienceDTO;
import com.easydados.services.UserExperienceService;

@RestController
@RequestMapping("/user_experience")
public class UserExperienceController {
    
    @Autowired
    private UserExperienceService userExperienceService;

    @PostMapping(value = "/{id}")
    public ResponseEntity<UserExperience> createUserExperience(@RequestBody UserExperienceDTO data, @PathVariable Long id) throws Exception {
        UserExperience newUserExperience = userExperienceService.createUserExperiences(data, id);

        System.out.println("data" + id);

        return new ResponseEntity<>(newUserExperience, HttpStatus.CREATED);
    }

}
