package com.forte.assesment.ForteAssesmentFabian.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forte.assesment.ForteAssesmentFabian.model.User;
import com.forte.assesment.ForteAssesmentFabian.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<User> obtenerUsuario(){
        return userService.obtenerUsuario();
    }

    @PostMapping
    public User guardarUser(@RequestBody User user){
        return this.userService.guardarUsuario(user);
    }
}
