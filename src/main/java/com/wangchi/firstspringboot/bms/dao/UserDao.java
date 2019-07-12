package com.wangchi.firstspringboot.bms.dao;

import com.wangchi.firstspringboot.bms.beans.User;
import org.apache.ibatis.annotations.Mapper;



public interface UserDao {
    public User findUserById(int id);
    public void insertUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);


}
