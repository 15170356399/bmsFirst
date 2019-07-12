package com.wangchi.firstspringboot.bms.service;

import com.wangchi.firstspringboot.bms.beans.Book;



public interface BookService {
    public void lendBook(int id) ;
    public void repayBook(int id);
    public void addBook(Book book);
    public void deleteBook(int id);
    public Book getBook(int id);
    public void updateBook(Book book);

}
