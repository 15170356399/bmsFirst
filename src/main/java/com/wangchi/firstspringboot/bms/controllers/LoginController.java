package com.wangchi.firstspringboot.bms.controllers;


import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginController {

    @GetMapping("")
    public String login(){
        return "login";
    }
    @PostMapping("/login")
    public String login(@RequestParam("id") int id,@RequestParam("password") String password){
        if(id==123456&&"123456".equals(password))
            return "redirect:/main";
        else return "login";
    }
    @GetMapping("/main")
    public String loginSuccess(){
        return "main";
    }
}
