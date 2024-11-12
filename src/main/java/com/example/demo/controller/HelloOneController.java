package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.JSONResult;
import com.example.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
public class HelloOneController {

    @GetMapping("/helloone")
    public String hello(Model model) {
        List<User> list = new ArrayList<>();
        User userOne = new User("11",11,"123");
        User userTwo = new User("22",22,"123");
        User userThree = new User("33",33,"123");
        list.add(userOne);
        list.add(userTwo);
        list.add(userThree);
        User user = new User();
        user.setName("11");
        model.addAttribute("name", "Hello Thymeleaf From Spring Boot");
        model.addAttribute("user", user);
        model.addAttribute("flag", "yes");
        model.addAttribute("status","doing");
        model.addAttribute("list", list);
        return "hello";
    }

//    @RequestMapping(value="getUser")
//    public String getUserJson(Model model) {
//        User u = new User();
//        u.setName("weiz222");
//        u.setAge(20);
//        u.setBirthday(new Date());
//        u.setPassword("weiz222");
//        model.addAttribute("JSONResult", JSONObject.toJSONString(new JSONResult(u)));
//        return "index";
//    }


    @RequestMapping("/layout/index")
    public String index() {
        return "layout/index";
    }

}
