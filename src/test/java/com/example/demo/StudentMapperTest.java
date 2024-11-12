package com.example.demo;

import com.example.demo.bean.Classes;
import com.example.demo.bean.Student;
import com.example.demo.mapper.test1.PrimaryStudentMapper;
import com.example.demo.mapper.test2.SecondaryStudentMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentMapperTest {

    @Autowired
    @Qualifier("test1SqlSessionTemplate")
    private SqlSessionTemplate test1SqlSessionTemplate;

    @Autowired
    @Qualifier("test2SqlSessionTemplate")
    private SqlSessionTemplate test2SqlSessionTemplate;

    @Test
    public void testSelectAll() {
        assert test1SqlSessionTemplate != null;
        assert test2SqlSessionTemplate != null;

        PrimaryStudentMapper primaryMapper = test1SqlSessionTemplate.getMapper(PrimaryStudentMapper.class);
        List<Student> studentsPrimary = primaryMapper.selectAll();
        for (Student student : studentsPrimary) {
            System.out.println("name:"+student.getName()+",age="+student.getAge());
        }
        SecondaryStudentMapper secondaryMapper = test2SqlSessionTemplate.getMapper(SecondaryStudentMapper.class);
        List<Student> studentsSecondary = secondaryMapper.selectAllTwo();
        for (Student student : studentsSecondary) {
            System.out.println("name:"+student.getName()+",age="+student.getAge());
        }
    }

    @Test
    public void testInsert() {
        PrimaryStudentMapper primaryMapper = test1SqlSessionTemplate.getMapper(PrimaryStudentMapper.class);
        primaryMapper.insert(new Student("weiz新增",1,30));
    }

    @Test
    public void testUpdate() {
        PrimaryStudentMapper primaryMapper = test1SqlSessionTemplate.getMapper(PrimaryStudentMapper.class);
        Student student = primaryMapper.selectOne(5L);
        student.setSex(11);
        primaryMapper.update(student);
    }

    @Test
    public void testSelectOne() {
        PrimaryStudentMapper primaryMapper = test1SqlSessionTemplate.getMapper(PrimaryStudentMapper.class);
        Student student = primaryMapper.selectOne(5L);
        System.out.println(student.toString());
    }

    @Test
    public void testDelete() {
        PrimaryStudentMapper primaryMapper = test1SqlSessionTemplate.getMapper(PrimaryStudentMapper.class);
//        primaryMapper.delete(4L);
    }

    @Test
    public void testSelectStudentAndClass()
    {
        PrimaryStudentMapper primaryMapper = test1SqlSessionTemplate.getMapper(PrimaryStudentMapper.class);
        Student student = primaryMapper.selectStudentAndClass(5L);
        System.out.println("name:"+student.getName()+",age="+student.getAge()
        +",class name:"+student.getClasses().getName()+",class memo:"+student.getClasses().getMemo());
    }

    @Test
    public void testSelectClassesAndStudent(){
        PrimaryStudentMapper primaryMapper = test1SqlSessionTemplate.getMapper(PrimaryStudentMapper.class);
        Classes classes = primaryMapper.selectClassAndStudent(1L);
        System.out.println("班级信息:name:"+classes.getName()+",memo:"+classes.getMemo());
        System.out.println("学生信息列表,总人数:"+classes.getStudents().size());
        for(Student student:classes.getStudents()){
            System.out.println("name:"+student.getName()+",age="+student.getAge());
        }
    }

    @Test
    public void testSelectListPaged(){
        PrimaryStudentMapper primaryMapper = test1SqlSessionTemplate.getMapper(PrimaryStudentMapper.class);
        PageHelper.startPage(1,5);
        List<Student> students = primaryMapper.selectAll();
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        System.out.println("总页数:"+pageInfo.getPages()+",总条数:"+pageInfo.getTotal()
            +"当前页:"+pageInfo.getPageNum());
        for(Student student:students){
            System.out.println("name:"+student.getName()+",age="+student.getAge());
        }

    }

}
