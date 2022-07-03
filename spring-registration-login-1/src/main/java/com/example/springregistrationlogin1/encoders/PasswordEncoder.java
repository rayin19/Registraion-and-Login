package com.example.springregistrationlogin1.encoders;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoder {

    public BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
}
