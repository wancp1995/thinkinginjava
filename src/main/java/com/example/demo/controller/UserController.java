package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private Map<Integer,String> userDatabase = new HashMap<>();

    public UserController() {
        userDatabase.put(1,"Alice");
        userDatabase.put(2,"Bob");
    }

    @GetMapping
    public List<Map.Entry<Integer,String>> getAllUsers() {
        return new ArrayList<>(userDatabase.entrySet());
    }

    @GetMapping("/{id}")
    public String user(@PathVariable Integer id) {
        return userDatabase.get(id);
    }

    @PostMapping
    public String addUser(@RequestParam Integer id, @RequestParam String name) {
        userDatabase.put(id,name);
        return "User added successfully";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Integer id, @RequestParam String name) {
        if(userDatabase.containsKey(id)) {
            userDatabase.put(id,name);
            return "User updated successfully";
        }
        return "User not found";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id) {
        if(userDatabase.containsKey(id)) {
            userDatabase.remove(id);
            return "User deleted successfully";
        }
        return "User not found";
    }

}
