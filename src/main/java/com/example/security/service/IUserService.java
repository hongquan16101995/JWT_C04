package com.example.security.service;

import com.example.security.model.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface IUserService extends UserDetailsService {
    Users save(Users users);

    void delete(Long id);

    Optional<Users> findById(Long id);

    Optional<Users> findByUsername(String name);

    List<Users> findAll();
}
