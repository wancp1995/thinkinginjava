package com.example.demo.controller;

import com.example.demo.bean.Person;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1/persons")
public class PersonOneController {

    List<Person> personList = new ArrayList<>();

    public PersonOneController() {
        personList.add(new Person(1L, "Alice", 12, "123@163.com"));
        personList.add(new Person(2L, "Bob", 12, "123@163.com"));
    }

    @Operation(summary = "Get all persons", description = "Retrieve all persons from the database.")
    @GetMapping
    public List<Person> getAllPersons() {
        return personList;
    }

    @Operation(summary = "Get person by ID", description = "Retrieve a person by their unique ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the person"),
            @ApiResponse(responseCode = "404", description = "Person not found")
    })
    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        int personIndex = getPersonIndexUsingPersonId(id);
        Person person = personList.get(personIndex);
        return person;
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

    @Operation(summary = "Create a new person", description = "Create a new person in the database.")
    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        personList.add(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

    @Operation(summary = "Update an existing person", description = "Update an existing person by ID.")
    @PutMapping("/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Long id, @RequestBody Person person) {
        int personIndex = getPersonIndexUsingPersonId(id);
        personList.set(personIndex, person);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @Operation(summary = "Delete a person", description = "Delete a person by their unique ID.")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerson(@PathVariable Long id) {
        int personIndex = getPersonIndexUsingPersonId(id);
        personList.remove(id);
        return ResponseEntity.noContent().build();
    }

}
