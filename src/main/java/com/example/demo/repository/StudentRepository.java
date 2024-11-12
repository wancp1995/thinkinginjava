package com.example.demo.repository;

import com.example.demo.bean.Student;

public interface StudentRepository {
    int save(Student student);
    int update(Student student);
    int delete(long id);
    Student findById(long id);
}
