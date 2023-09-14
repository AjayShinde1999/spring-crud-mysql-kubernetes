package com.spring.crud.mysql.kubernetes.controller;

import com.spring.crud.mysql.kubernetes.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.spring.crud.mysql.kubernetes.model.User;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User user1 = userService.saveOneUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Integer id){
        User user = userService.getById(id);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOneUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return new ResponseEntity<>("Deleted Successfully",HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateOneUser(@RequestBody User user, @PathVariable Integer id){
        User user1 = userService.updateUser(user, id);
        return new ResponseEntity<>(user1,HttpStatus.OK);
    }
}
