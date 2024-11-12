package com.example.demo.mapper.test1;

import com.example.demo.bean.Classes;
import com.example.demo.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface PrimaryStudentMapper {
    List<Student> selectAll();
    Student selectOne(Long id);
    void insert(Student student);
    void update(Student student);
    void delete(Long id);
    Student selectStudentAndClass(Long id);
    Classes selectClassAndStudent(Long id);
    List<Student> selectByCondition(Student student);
}
