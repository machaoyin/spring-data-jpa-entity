package com.mcy.springdatajpa.springdatajpaentity.repository;

import com.mcy.springdatajpa.springdatajpaentity.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
