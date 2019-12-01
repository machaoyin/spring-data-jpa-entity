package com.mcy.springdatajpa.springdatajpaentity.entity;

import javax.persistence.*;

/**
 * 公共实体类
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class SysUser {
    @Id
    @GeneratedValue
    protected Integer id;
    protected String username;
    protected String password;
    protected String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
