package com.easydados.services;

import com.easydados.domain.User;
import com.easydados.dtos.UserDTO;
import com.easydados.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User createUser(UserDTO data) {
        User newUser = new User(data);
       this.saveUser(newUser);
       return  newUser;
    }

    public void saveUser(User user) { this.repository.save(user); }

    public User getUser(Long id) throws Exception{
        return this.repository.findUserById(id).orElseThrow(() -> new Exception("User not found"));
    }

    public List<User> getAllUsers() {
        return this.repository.findAll();
    }
}
