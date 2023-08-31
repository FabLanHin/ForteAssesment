package com.forte.assesment.ForteAssesmentFabian.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forte.assesment.ForteAssesmentFabian.model.User;
import com.forte.assesment.ForteAssesmentFabian.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ArrayList<User> obtenerUsuario(){
        return (ArrayList<User>) userRepository.findAll();
    }

    public User guardarUsuario(User user){
        return userRepository.save(user);
    }
}
