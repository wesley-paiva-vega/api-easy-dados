package com.easydados.controllers;

import com.easydados.domain.User;
import com.easydados.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService users;

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = this.users.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
