package com.example.security.service;

import com.example.security.model.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    Student save(Student student);

    Optional<Student> findById(Long id);

    List<Student> findAll();

    void delete(Long id);
}
