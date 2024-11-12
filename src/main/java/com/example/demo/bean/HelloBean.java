package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloBean {

    @Value("${com.weiz.costum.fristname}")
    private String firstName;

    @Value("${con.weiz.costum.secondname}")
    private String secondName;

}
