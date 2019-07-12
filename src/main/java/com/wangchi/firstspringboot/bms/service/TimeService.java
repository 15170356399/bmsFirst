package com.wangchi.firstspringboot.bms.service;


import com.wangchi.firstspringboot.bms.dao.UserDao;

/**
 * 处理超时罚款，内嵌在还书处理
 */
public interface TimeService {

    public boolean subMoney(int userId,int bookNumber);

}
