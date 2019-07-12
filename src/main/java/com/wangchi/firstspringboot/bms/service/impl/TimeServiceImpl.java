package com.wangchi.firstspringboot.bms.service.impl;

import com.wangchi.firstspringboot.bms.beans.User;
import com.wangchi.firstspringboot.bms.dao.UserDao;
import com.wangchi.firstspringboot.bms.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeServiceImpl implements TimeService {

    @Autowired
    private UserDao userDao;
    @Override
    public boolean subMoney(int userId, int bookNumber) {
            User user =userDao.findUserById(userId);
            if(user.getMoney()-2*bookNumber>=0) {
                user.setMoney(user.getMoney() - 2 * bookNumber);
                userDao.updateUser(user);
                return true;
            }
            else {
                System.out.println("读者余额不足");//此处需修改为一个警告
                return false;
            }
    }
}
