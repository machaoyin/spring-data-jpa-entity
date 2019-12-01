package com.mcy.springdatajpa.springdatajpaentity.repository;

import com.mcy.springdatajpa.springdatajpaentity.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<SysUser, Integer> {

}
