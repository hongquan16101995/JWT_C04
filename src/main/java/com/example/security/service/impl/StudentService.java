package com.example.security.service.impl;

import com.example.security.model.Student;
import com.example.security.repository.IStudentRepository;
import com.example.security.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository iStudentRepository;

    @Override
    public Student save(Student student) {
        return iStudentRepository.save(student);
    }

    @Override
    public Optional<Student> findById(Long id) {
        return iStudentRepository.findById(id);
    }

    @Override
    public List<Student> findAll() {
        return iStudentRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        iStudentRepository.deleteById(id);
    }
}
