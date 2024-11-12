package com.example.demo.mapper;

import com.example.demo.bean.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getLong("id"));
        student.setName(rs.getString("name"));
        student.setSex(rs.getInt("sex"));
        student.setAge(rs.getInt("age"));
        return student;
    }
}
