package com.wangchi.firstspringboot.bms.dao;

import com.wangchi.firstspringboot.bms.beans.Book;


public interface BookDao {

    public Book findBookById(int id);
    public void insertBook(Book book);
    public void deleteBook(int id);
    public void updateBook1(Book book);
    public void updateBook(int id,int amount);//由于只有借书和还书操作，所以只改变数量

}
