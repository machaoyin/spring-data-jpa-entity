package com.mcy.springdatajpa.springdatajpaentity.entity;

import javax.persistence.Entity;

/**
 * 学生类，继承公共实体类SysUser
 */
@Entity
public class Student extends SysUser {
    private String banji;

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }
}
