package com.wangchi.firstspringboot.bms.service.impl;

import com.wangchi.firstspringboot.bms.beans.UserBook;
import com.wangchi.firstspringboot.bms.dao.UserBookDao;
import com.wangchi.firstspringboot.bms.service.UserBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserBookServiceImpl implements UserBookService {
    @Autowired
    private UserBookDao userBookDao;

    @Override
    public UserBook findUserBookByUserId(int userId) {
        return userBookDao.findUserBookByUserId(userId);
    }

    @Override
    public UserBook findUserBookByBookId(int bookId) {
        return userBookDao.findUserBookByBookId(bookId);
    }

    @Override
    public void insertUserBook(UserBook userBook) {
        userBookDao.insertUserBook(userBook);
    }

    @Override
    public void deleteUserBook(int userId, int bookId) {
        userBookDao.deleteUserBook(userId,bookId);
    }
}
