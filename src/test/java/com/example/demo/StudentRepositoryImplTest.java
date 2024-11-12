package com.example.demo;

import com.example.demo.bean.Student;
import com.example.demo.mapper.StudentRowMapper;
import com.example.demo.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.*;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepositoryImplTest {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

//    @Test
//    public void save(){
//        Student student = new Student("weiz", 1, 30);
//        studentRepository.save(student);
//    }
//
//    @Test
//    public void update(){
//        Student student = new Student("weiz", 1, 18);
//        student.setId(1L);
//        studentRepository.save(student);
//    }

//    @Test
//    public void delete(){
//        studentRepository.delete(1L);
//    }

    @Test
    public void findById(){
        Student student = studentRepository.findById(2L);
        System.out.println("student == " + student.toString());
    }

    @Test
    public void rowMapper(){
        List<Student> students = jdbcTemplate.query("select * from student", new StudentRowMapper());
        for (Student student : students) {
            System.out.println("student == " + student.toString());
        }
    }

    @Test
    public void saveTwo()
    {
        Student student = new Student("zhangsan",1,20);
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int id = jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement("insert into student(name,sex,age) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
                ps.setString(1,student.getName());
                ps.setInt(2,student.getSex());
                ps.setInt(3,student.getAge());
                return ps;
            }
        }, keyHolder);
        student.setId(keyHolder.getKey().longValue());
        System.out.println(keyHolder.getKey().longValue());
    }





}
