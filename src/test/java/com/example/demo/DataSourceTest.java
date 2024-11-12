//package com.example.demo;
//
//import com.example.demo.bean.Student;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class DataSourceTest {
//
//    @Autowired
//    @Qualifier("primaryJdbcTemplate")
//    private JdbcTemplate primaryJdbcTemplate;
//
//    @Autowired
//    @Qualifier("secondaryJdbcTemplate")
//    private JdbcTemplate secondaryJdbcTemplate;
//
//    @Test
//    public void dataSourceTest() {
//        Student student = new Student("weiz多数据源",0,30);
//        primaryJdbcTemplate.update("INSERT INTO student(name,sex,age) values (?,?,?)",
//                student.getName(),student.getSex(),student.getAge());
//        secondaryJdbcTemplate.update("INSERT INTO student(name,sex,age) values (?,?,?)",
//                student.getName(),student.getSex(),student.getAge());
//    }
//
//}
