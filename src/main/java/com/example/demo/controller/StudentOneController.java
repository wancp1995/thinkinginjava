package com.example.demo.controller;

import com.example.demo.bean.Student;
import com.example.demo.service.StudentOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/studentsone")
public class StudentOneController {

    @Autowired
    private StudentOneService studentOneService;

    @GetMapping("/")
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentOneService.listAllStudent());
        return "studentsone/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "studentsone/add";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        studentOneService.insertStudent(student);
        return "redirect:/studentsone/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Student student = studentOneService.getStudentById(id);
        model.addAttribute("student", student);
        return "studentsone/edit";
    }

    @PostMapping("/edit/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute Student student) {
        student.setId(id);
        studentOneService.updateStudent(student);
        return "redirect:/studentsone/";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentOneService.deleteStudent(id);
        return "redirect:/studentsone/";
    }

    @GetMapping("/search")
    public String searchStudents(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer sex,
            @RequestParam(required = false) Integer age,Model model){
        Student student = new Student();
        student.setName(name);
        student.setSex(sex);
        student.setAge(age);
        model.addAttribute("students", studentOneService.findStudentsByCondition(student));
        return "studentsone/list";
    }

}
