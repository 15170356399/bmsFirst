package com.wangchi.firstspringboot.bms.controllers;


import com.wangchi.firstspringboot.bms.beans.Book;
import com.wangchi.firstspringboot.bms.service.BookService;
import com.wangchi.firstspringboot.bms.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/get/{id}")
    public Book getBook(@PathVariable("id")  int id){
        return bookService.getBook(id);
    }

    @PostMapping("/add")
    public Book insertBook(Book book){
        bookService.addBook(book);
        return  book ;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") int id){
        bookService.deleteBook(id);
        return "删除成功";
    }



}
