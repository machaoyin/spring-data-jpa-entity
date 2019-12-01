package com.mcy.springdatajpa.springdatajpaentity.service;

import com.mcy.springdatajpa.springdatajpaentity.entity.Teacher;
import com.mcy.springdatajpa.springdatajpaentity.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherService {

    @Resource
    private TeacherRepository teacherRepository;

    public void save(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }
}
