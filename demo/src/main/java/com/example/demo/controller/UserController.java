package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    // 1️⃣ Simple GET
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to User API!";
    }

    // 2️⃣ Path Variable Example
    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id) {
        return "User ID is: " + id;
    }

    // 3️⃣ Request Parameter Example
    @GetMapping("/search")
    public String searchUser(@RequestParam String name) {
        return "Searching user with name: " + name;
    }

    // 4️⃣ Returning JSON Object
    @GetMapping("/profile")
    public User getUserProfile() {
        return new User(1, "Abdullah", "Developer");
    }
}
