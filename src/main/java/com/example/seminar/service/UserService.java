package com.example.seminar.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.seminar.model.User;
import com.example.seminar.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);
    
    User findByName(String name);

    User save(UserRegistrationDto registration);
}