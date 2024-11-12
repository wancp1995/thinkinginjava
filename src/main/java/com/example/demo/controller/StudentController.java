//package com.example.demo.controller;
//
//import com.example.demo.bean.Student;
//import com.example.demo.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@RequestMapping("/students")
//public class StudentController {
//
//    @Autowired
//    private StudentService studentService;
//
//    @GetMapping("/")
//    public String getAllStudents(Model model) {
//        model.addAttribute("students", studentService.listAllStudent());
//        return "students/list";
//    }
//
//    @GetMapping("/add")
//    public String showAddForm(Model model) {
//        model.addAttribute("student", new Student());
//        return "students/add";
//    }
//
//    @PostMapping("/add")
//    public String addStudent(@ModelAttribute Student student) {
//        studentService.insertStudent(student);
//        return "redirect:/students/";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable Long id, Model model) {
//        Student student = studentService.getStudentById(id);
//        model.addAttribute("student", student);
//        return "students/edit";
//    }
//
//    @PostMapping("/edit/{id}")
//    public String updateStudent(@PathVariable Long id, @ModelAttribute Student student) {
//        student.setId(id);
//        studentService.updateStudent(student);
//        return "redirect:/students/";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteStudent(@PathVariable Long id) {
//        studentService.deleteStudent(id);
//        return "redirect:/students/";
//    }
//
//}
