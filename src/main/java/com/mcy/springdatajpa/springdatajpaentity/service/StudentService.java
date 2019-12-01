package com.mcy.springdatajpa.springdatajpaentity.service;

import com.mcy.springdatajpa.springdatajpaentity.entity.Student;
import com.mcy.springdatajpa.springdatajpaentity.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {

    @Resource
    private StudentRepository studentRepository;

    public void save(Student student) {
        studentRepository.save(student);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
