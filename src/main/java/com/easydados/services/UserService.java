package com.easydados.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<String> findAllUsers() {
        ArrayList<String> users = new ArrayList<>();

        users.add("Wesley");
        users.add("Paulo");
        users.add("E Pedrin");


        return users;
    }
}
