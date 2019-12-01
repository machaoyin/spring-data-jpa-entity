package com.mcy.springdatajpa.springdatajpaentity.entity;

import javax.persistence.Entity;

/**
 * 老师类，继承公共实体类SysUser
 */
@Entity
public class Teacher extends SysUser{
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
