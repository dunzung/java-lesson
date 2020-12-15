package com.dunzung.java.spring.controller;

import com.dunzung.java.spring.model.UserRequest;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @PostMapping("/add")
    public String addUser(@RequestBody UserRequest userRequest){
        System.out.println(new Gson().toJson(userRequest));
        return "add user";
    }

}
