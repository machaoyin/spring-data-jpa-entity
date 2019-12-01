package com.mcy.springdatajpa.springdatajpaentity.controller;

import com.mcy.springdatajpa.springdatajpaentity.entity.Student;
import com.mcy.springdatajpa.springdatajpaentity.entity.Teacher;
import com.mcy.springdatajpa.springdatajpaentity.service.StudentService;
import com.mcy.springdatajpa.springdatajpaentity.service.TeacherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/index")
public class IndexController {
    @Resource
    private StudentService studentService;
    @Resource
    private TeacherService teacherService;

    @RequestMapping("/save")
    public String save(){
        Teacher t1=new Teacher();
        t1.setName("张老师");
        t1.setUsername("t01");
        t1.setPassword("1111");
        t1.setJob("班主任");
        teacherService.save(t1);
        Student s1=new Student();
        s1.setName("李学生");
        s1.setBanji("软件工程一班");
        s1.setUsername("20170101");
        s1.setPassword("2222");
        studentService.save(s1);
        return "数据保存成功";
    }

    @RequestMapping("/findStu")
    public Object findStu(){
        List<Student> stu = studentService.findAll();
        return stu;
    }

    @RequestMapping("/findTeacher")
    public Object findTeacher(){
        List<Teacher> teachers = teacherService.findAll();
        return teachers;
    }
}
