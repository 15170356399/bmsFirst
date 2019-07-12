package com.wangchi.firstspringboot.bms.service.impl;

import com.wangchi.firstspringboot.bms.beans.User;
import com.wangchi.firstspringboot.bms.dao.UserDao;
import com.wangchi.firstspringboot.bms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserBydId(int id) {
        return userDao.findUserById(id);
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
