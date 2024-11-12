//package com.example.demo.repository;
//
//import com.example.demo.bean.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class StudentRepositoryImpl implements StudentRepository {
//
//    @Autowired
//    @Qualifier("primaryJdbcTemplate")
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public int save(Student student) {
//        return jdbcTemplate.update("INSERT INTO student (name, sex, age) values (?, ?, ?)",
//                student.getName(),student.getSex(),student.getAge());
//    }
//
//    @Override
//    public int update(Student student) {
//        return jdbcTemplate.update("UPDATE student SET name = ?, sex = ?, age = ? WHERE id = ?",
//                student.getName(),student.getSex(),student.getAge(),student.getId());
//    }
//
//    @Override
//    public int delete(long id) {
//        return jdbcTemplate.update("DELETE FROM student WHERE id = ?", id);
//    }
//
//    @Override
//    public Student findById(long id) {
//        return jdbcTemplate.queryForObject("SELECT * FROM student WHERE id = ?", new BeanPropertyRowMapper<Student>(Student.class), id);
//    }
//}
