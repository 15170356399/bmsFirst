package com.wangchi.firstspringboot.bms.controllers;

import com.wangchi.firstspringboot.bms.beans.UserBook;
import com.wangchi.firstspringboot.bms.dao.UserBookDao;
import com.wangchi.firstspringboot.bms.service.UserBookService;
import com.wangchi.firstspringboot.bms.service.impl.UserBookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userbook")
public class UserBookController {
    @Autowired
    private UserBookService userBookService;

    @GetMapping("get/{id}")
    public UserBook getUserBookByUserId(@PathVariable("id") int id){
        return userBookService.findUserBookByUserId(id);
    }
}
