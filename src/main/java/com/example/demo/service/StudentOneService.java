package com.example.demo.service;

import com.example.demo.bean.Student;
import com.example.demo.mapper.test1.PrimaryStudentMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentOneService {



    private final PrimaryStudentMapper primaryMapper;

    @Autowired
    public StudentOneService(@Qualifier("test1SqlSessionTemplate") SqlSessionTemplate test1SqlSessionTemplate){
        this.primaryMapper = test1SqlSessionTemplate.getMapper(PrimaryStudentMapper.class);
    }


    public List<Student> listAllStudent(){
        List<Student> studentsPrimary = primaryMapper.selectAll();
        return studentsPrimary;
    }

    public Student getStudentById(Long id){
        Student student = primaryMapper.selectOne(id);
        return student;
    }

    public void insertStudent(Student student){
        primaryMapper.insert(student);
    }

    public void updateStudent(Student student){
        primaryMapper.update(student);
    }

    public void deleteStudent(Long id){
        primaryMapper.delete(id);
    }

    public List<Student> findStudentsByCondition(Student student){
        return primaryMapper.selectByCondition(student);
    }

}
