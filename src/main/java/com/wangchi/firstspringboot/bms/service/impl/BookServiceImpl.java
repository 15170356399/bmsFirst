package com.wangchi.firstspringboot.bms.service.impl;

import com.wangchi.firstspringboot.bms.beans.Book;
import com.wangchi.firstspringboot.bms.dao.BookDao;
import com.wangchi.firstspringboot.bms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public void lendBook(int id) {
        bookDao.updateBook(id,-1);
    }

    @Override
    public void repayBook(int id) {
        bookDao.updateBook(id,1);
    }

    @Override
    public void addBook(Book book) {
            bookDao.insertBook(book);
    }

    @Override
    public void deleteBook(int id) {
            bookDao.deleteBook(id);
    }

    @Override
    public Book getBook(int id) {
        return bookDao.findBookById(id);
    }

    @Override
    public void updateBook(Book book) {
        bookDao.updateBook1(book);
    }
}
