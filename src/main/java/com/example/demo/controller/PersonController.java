package com.example.demo.controller;

import com.example.demo.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/persons")
public class PersonController {

    List<Person> personList = new ArrayList<>();

    public PersonController() {
        personList.add(new Person(1L, "Alice", 12, "123@163.com"));
        personList.add(new Person(2L, "Bob", 12, "123@163.com"));
    }

    @GetMapping
    public String listPersons(Model model) {
        model.addAttribute("persons", personList);
        return "person/list";
    }

    @GetMapping("/add")
    public String addPersonForm(Model model) {
        model.addAttribute("person", new Person());
        return "person/add";
    }

    @PostMapping("/add")
    public String savePerson(@ModelAttribute Person person) {
        person.setId(Long.valueOf(personList.size()) + 1);
        personList.add(person);
        return "redirect:/persons";
    }

    @GetMapping("/edit/{id}")
    public String editPersonForm(@PathVariable Long id, Model model) {
        int personIndex = getPersonIndexUsingPersonId(id);
        Person person = personList.get(personIndex);
        model.addAttribute("person", person);
        return "person/edit";
    }

    private Integer getPersonIndexUsingPersonId(Long personId)
    {
        int personIndex = 0;
        for (Person personObj : personList) {
            if (personObj.getId() == personId) {
                personIndex = personList.indexOf(personObj);
            }
        }
        return personIndex;
    }

    @PostMapping("/edit/{id}")
    public String updatePerson(@PathVariable Long id, @ModelAttribute Person person) {
        int personIndex = getPersonIndexUsingPersonId(id);
        personList.set(personIndex, person);
        return "redirect:/persons";
    }

    @GetMapping("/delete/{id}")
    public String deletePerson(@PathVariable Long id) {
        int personIndex = getPersonIndexUsingPersonId(id);
        personList.remove(personIndex);
        return "redirect:/persons";
    }


}
