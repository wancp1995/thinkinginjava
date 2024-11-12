package com.example.demo.controller;


import com.example.demo.bean.JSONResult;
import com.example.demo.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello @ Spring Boot";
    }

    @RequestMapping(value="getUser", produces="application/json")
    public JSONResult getUserJson() {
        User u = new User();
        u.setName("weiz222");
        u.setAge(20);
        u.setBirthday(new Date());
        u.setPassword("weiz222");
        return JSONResult.ok(u);
    }

}
