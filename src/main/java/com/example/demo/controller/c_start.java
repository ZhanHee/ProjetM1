package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class c_start {
    @RequestMapping("/helloworld")
    public String helloword(){
        return "Helloword";
    }

    @RequestMapping("/tiancailyz")
    public String lyz(){
        return "天才lyz";
    }
}
