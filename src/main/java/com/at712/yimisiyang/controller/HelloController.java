package com.at712.yimisiyang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//自动装配
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(){
        return "Hello Spring Boot.";
    }
}
