package com.wangchi.firstspringboot.bms.service;

import com.wangchi.firstspringboot.bms.beans.User;


public interface UserService {


    public User getUserBydId(int id);
    public void insertUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
}
