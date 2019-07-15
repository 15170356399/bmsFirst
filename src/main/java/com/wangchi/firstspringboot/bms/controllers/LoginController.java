package com.wangchi.firstspringboot.bms.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@Controller
public class LoginController {


    @PostMapping("/login")
    public String login(@RequestParam("id") int id, @RequestParam("password") String password, HttpSession session){
        if(id==123456&&"123456".equals(password)) {
            session.setAttribute("user","123456");
            return "redirect:/main";
        }
        else return "redirect:/";
    }
//    @GetMapping("/main")
//    public String loginSuccess(){
//        return "main";
//    }
}
