package com.example.firstdemo.controller;

import com.example.firstdemo.domain.User;
import com.example.firstdemo.respository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    private final UserRespository userRespository;
    @Autowired
    public UserController(UserRespository userRespository){
        this.userRespository=userRespository;
    }
    @RequestMapping ("/person/save")
    public User save(@RequestParam String name){
        User user=new User();
        userRespository.save(user);
        user.setName(name);
        System.out.print(user.toString());

        return user;
    }
}
