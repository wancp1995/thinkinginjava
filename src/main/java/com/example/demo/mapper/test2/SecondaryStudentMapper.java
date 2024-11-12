package com.example.demo.mapper.test2;

import com.example.demo.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface SecondaryStudentMapper {
    List<Student> selectAllTwo();
}
