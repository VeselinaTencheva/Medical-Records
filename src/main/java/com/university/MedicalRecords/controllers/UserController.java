package com.university.MedicalRecords.controllers;

import com.university.MedicalRecords.entities.User;
import com.university.MedicalRecords.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        this.userService.create(user);
    }
}
