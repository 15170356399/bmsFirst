package com.wangchi.firstspringboot.bms.beans;

import java.util.List;

public class User {
    private Integer Id;
    private String name;
    private String password;
    private int  money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(Integer id) {
        Id = id;
    }

    public User() {
    }
}
