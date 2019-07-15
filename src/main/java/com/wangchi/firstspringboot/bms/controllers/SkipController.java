package com.wangchi.firstspringboot.bms.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 该类配置跳转请求与静态html相映射
 */
@Controller
public class SkipController {

    @GetMapping("/addBook")
    public String toAddBook(){
        return "addBook";
    }
    @GetMapping("/subBook")
    public String toSubBook(){
        return "subBook";
    }
    @GetMapping("/lendBook")
    public String toLendBook(){
        return "lendBook";
    }
    @GetMapping("/repayBook")
    public String toRepayBook(){
        return "repayBook";
    }
    @GetMapping("/getReaderLend")
    public String toGetReaderLend(){
        return "getReaderLend";
    }
    @GetMapping("/subMoney")
    public String toSubMoney(){
        return "subMoney";
    }
    @GetMapping("/getBook")
    public String toGetBook(){
        return "getbook";
    }
}
