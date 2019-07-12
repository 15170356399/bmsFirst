package com.wangchi.firstspringboot.bms.dao;

import com.wangchi.firstspringboot.bms.beans.UserBook;

import java.util.List;

public interface UserBookDao {

    public UserBook findUserBookByUserId(int userId);
    public UserBook findUserBookByBookId(int bookId);
    public void insertUserBook(UserBook userBook);
    public void deleteUserBook(int userId,int bookId);
}
