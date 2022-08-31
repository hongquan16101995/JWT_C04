package com.example.security.service.impl;

import com.example.security.model.Roles;
import com.example.security.model.UserPrinciple;
import com.example.security.model.Users;
import com.example.security.repository.IUserRepository;
import com.example.security.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public Users save(Users users) {
        return iUserRepository.save(users);
    }

    @Override
    public void delete(Long id) {
        iUserRepository.deleteById(id);
    }

    @Override
    public Optional<Users> findById(Long id) {
        return iUserRepository.findById(id);
    }

    @Override
    public Optional<Users> findByUsername(String name) {
        return iUserRepository.findByUsername(name);
    }

    @Override
    public List<Users> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> userOptional = iUserRepository.findByUsername(username);
        if (!userOptional.isPresent()) {
            throw new UsernameNotFoundException(username);
        }
        return UserPrinciple.build(userOptional.get());
    }
}
