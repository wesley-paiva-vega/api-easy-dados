package com.easydados.services;

import java.util.Optional;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easydados.domain.User;
import com.easydados.domain.UserExperience;
import com.easydados.dtos.UserExperienceDTO;
import com.easydados.repositories.UserExperienceRepository;

@Service
public class UserExperienceService {
    
    @Autowired
    private UserExperienceRepository UserExperienceRepository;

    @Autowired
    private UserService userService;

    public void saveUserExperience(UserExperience data) {
        System.out.println(data);
        this.UserExperienceRepository.save(data);
    }

    public UserExperience createUserExperiences (UserExperienceDTO data, Long id) throws Exception {
        User user = userService.getUser(id);

        if(user == null) {
           throw new Exception(" Usuário não encontrado" +  id);
        }

        UserExperience newUserExperience = new UserExperience(data);

        newUserExperience.setUser(user);

        this.saveUserExperience(newUserExperience);

        System.out.println(newUserExperience + "User aqui");

        return newUserExperience;
    }
}
