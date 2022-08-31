package com.example.security.service.impl;

import com.example.security.model.Roles;
import com.example.security.repository.IRoleRepository;
import com.example.security.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepository iRoleRepository;
    @Override
    public List<Roles> findAll() {
        return iRoleRepository.findAll();
    }
}
