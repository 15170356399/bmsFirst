package com.wangchi.firstspringboot.bms.controllers;


import com.wangchi.firstspringboot.bms.beans.Book;
import com.wangchi.firstspringboot.bms.beans.UserBook;
import com.wangchi.firstspringboot.bms.dao.BookDao;
import com.wangchi.firstspringboot.bms.service.BookService;
import com.wangchi.firstspringboot.bms.service.UserBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/lendandrepay")
@RestController
public class LendAndRepayController {

    @Autowired
    private BookService bookService;
    @Autowired
    private UserBookService userBookService;

    @Transactional
    @PostMapping("/lendbook")
    public String lendBook(UserBook userBook){
//        System.out.println("lendBook.....");
        //System.out.println(myJson);
        try {
            for (Book book : userBook.getBooks())
                bookService.lendBook(book.getId());
            userBookService.insertUserBook(userBook);
        }catch (Exception e){
            //此处抛出书已被借完错误
            System.out.println("lendBook..failed");
            return "借书失败";
        }
        return "借书成功";
   }

   @Transactional
    @PostMapping("/repaybook")
    public String repayBook(UserBook userBook){

        for(Book book:userBook.getBooks()){
            bookService.repayBook(book.getId());
            userBookService.deleteUserBook(userBook.getUser().getId(),book.getId());
        }
        return "借书成功";
    }


}
