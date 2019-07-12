package com.wangchi.firstspringboot.bms;

import com.wangchi.firstspringboot.bms.beans.Book;
import com.wangchi.firstspringboot.bms.beans.UserBook;
import com.wangchi.firstspringboot.bms.dao.UserBookDao;
import com.wangchi.firstspringboot.bms.service.BookService;
import com.wangchi.firstspringboot.bms.service.UserBookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BmsApplicationTests {
    @Autowired
    private BookService bookService;
    @Autowired
    private UserBookService userBookService;

    @Test
    //@Transactional
    public void contextLoads() {
        List<Integer> booksid=new ArrayList<>();
        booksid.add(10002);
        Date date=new Date();
        UserBook userBook=new UserBook(1003, booksid,date);
        try {
            for(Book book:userBook.getBooks())
                bookService.lendBook(book.getId());
            userBookService.insertUserBook(userBook);
        }catch (Exception e){
            System.out.println("书被借完");
        }


//        for(Book book:userBook.getBooks()){
//            bookService.repayBook(book.getId());
//            userBookService.deleteUserBook(userBook.getUser().getId(),book.getId());
//        }
   }
    }


