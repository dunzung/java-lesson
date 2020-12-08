package com.dunzung.java.spring.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.dunzung.java.spring.entity.UserEntity;
import com.dunzung.java.spring.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody UserEntity userRequest) {
        LambdaQueryWrapper<UserEntity> lambdaQuery = Wrappers.lambdaQuery();
        lambdaQuery.eq(UserEntity::getUserName, userRequest.getUserName());
        UserEntity u = userService.getOne(lambdaQuery);
        System.out.println(new Gson().toJson(u));
        LambdaUpdateWrapper<UserEntity> lambdaUpdateWrapper = Wrappers.lambdaUpdate();
        lambdaUpdateWrapper.eq(UserEntity::getUserId, userRequest.getUserId());
        userService.update(userRequest, lambdaUpdateWrapper);
        return "add use1r";
    }

}
