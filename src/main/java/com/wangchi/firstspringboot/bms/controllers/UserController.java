package com.wangchi.firstspringboot.bms.controllers;


import com.wangchi.firstspringboot.bms.beans.User;
import com.wangchi.firstspringboot.bms.service.UserService;
import com.wangchi.firstspringboot.bms.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") int id){
            return  userService.getUserBydId(id);
    }

    @PostMapping("/add")
    public User setUser(User user){
         userService.insertUser(user);
        return user;
    }
}
