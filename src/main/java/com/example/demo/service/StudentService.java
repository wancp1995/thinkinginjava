//package com.example.demo.service;
//
//import com.example.demo.bean.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class StudentService {
//
//    @Autowired
//    @Qualifier("primaryJdbcTemplate")
//    private JdbcTemplate jdbcTemplate;
//
//    public List<Student> listAllStudent(){
//        String sql = "select * from student";
//        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
//    }
//
//    public Student getStudentById(Long id){
//        String sql = "select * from student where id=?";
//        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Student.class));
//    }
//
//    public void insertStudent(Student student){
//        String sql = "insert into student(id, name, age, sex) values(?,?,?,?)";
//        jdbcTemplate.update(sql,student.getId(),student.getName(),student.getAge(),student.getSex());
//    }
//
//    public void updateStudent(Student student){
//        String sql = "update student set name=?,age=?,sex=? where id=?";
//        jdbcTemplate.update(sql,student.getName(),student.getAge(),student.getSex(),student.getId());
//    }
//
//    public void deleteStudent(Long id){
//        String sql = "delete from student where id=?";
//        jdbcTemplate.update(sql,id);
//    }
//
//}
