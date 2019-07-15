package com.wangchi.firstspringboot.bms.controllers;

import com.wangchi.firstspringboot.bms.beans.UserBook;
import com.wangchi.firstspringboot.bms.dao.UserBookDao;
import com.wangchi.firstspringboot.bms.service.UserBookService;
import com.wangchi.firstspringboot.bms.service.impl.UserBookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userbook")
public class UserBookController {
    @Autowired
    private UserBookService userBookService;

    @GetMapping("get")
    public UserBook getUserBookByUserId(@RequestParam("id") int id){
        return userBookService.findUserBookByUserId(id);
    }
}
