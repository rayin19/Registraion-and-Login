package com.example.springregistrationlogin1.service;

import com.example.springregistrationlogin1.entity.User;
import com.example.springregistrationlogin1.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService  extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
