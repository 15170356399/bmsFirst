package com.wangchi.firstspringboot.bms.service;

import com.wangchi.firstspringboot.bms.beans.UserBook;



public interface UserBookService {


    public UserBook findUserBookByUserId(int userId);
    public UserBook findUserBookByBookId(int bookId);
    public void insertUserBook(UserBook userBook);
    public void deleteUserBook(int userId,int bookId);
}
