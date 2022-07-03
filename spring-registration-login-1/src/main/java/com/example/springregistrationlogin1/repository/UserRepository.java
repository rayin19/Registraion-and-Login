package com.example.springregistrationlogin1.repository;

import com.example.springregistrationlogin1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
