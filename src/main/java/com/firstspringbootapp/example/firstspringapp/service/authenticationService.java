package com.firstspringbootapp.example.firstspringapp.service;

import org.springframework.stereotype.Service;

@Service
public class authenticationService {

    public boolean AuthenticateUser(String Name, String key){
        boolean isNameValid=Name.equalsIgnoreCase("Nirav");
        boolean isKeyValid=key.equalsIgnoreCase("abc");
        return isNameValid && isKeyValid;
    }
}
