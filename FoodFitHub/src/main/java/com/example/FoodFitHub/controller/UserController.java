package com.example.FoodFitHub.controller;

import com.example.FoodFitHub.entity.User;
import com.example.FoodFitHub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@RequestParam Long id){
        User user = userService.getUserById(id);
        return user == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(user);
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestParam Long id,@RequestBody User user){
        if(userService.getUserById(id) == null)
            return ResponseEntity.notFound().build();
        else {
            userService.save(user);
            return ResponseEntity.ok(user);
        }
    }

    @DeleteMapping("/{id}")
    public Map<String,Boolean> deleteUser(@RequestParam Long id){
        Map<String,Boolean> response = new HashMap<>();
        if(userService.getUserById(id) == null)
            response.put("Delete",Boolean.FALSE);
        else {
            userService.deleteUser(id);
            response.put("Delete",Boolean.TRUE);
        }
        return response;
    }
}
