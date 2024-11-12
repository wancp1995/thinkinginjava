package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
public class HelloBeanTest {

    @Autowired
    private Environment env;

    @Test
    void getEnv() {
        System.out.println(env.getProperty("com.weiz.costum.fristname"));
        System.out.println(env.getProperty("con.weiz.costum.secondname"));
    }

}
