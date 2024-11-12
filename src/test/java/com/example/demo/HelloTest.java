package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloTest {

    @Test
    public void test() {
        System.out.println("Hello Spring Boot Test");
    }

}
