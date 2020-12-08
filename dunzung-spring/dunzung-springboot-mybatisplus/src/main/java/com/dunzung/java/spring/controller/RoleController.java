package com.dunzung.java.spring.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.dunzung.java.spring.entity.RoleEntity;
import com.dunzung.java.spring.entity.UserEntity;
import com.dunzung.java.spring.service.RoleService;
import com.dunzung.java.spring.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/addRole")
    public String addRole(@RequestBody RoleEntity roleRequest) {
        LambdaQueryWrapper<RoleEntity> lambdaQuery = Wrappers.lambdaQuery();
        lambdaQuery.eq(RoleEntity::getRoleName, roleRequest.getRoleName());
        RoleEntity u = roleService.getOne(lambdaQuery);
        System.out.println(new Gson().toJson(u));
        return "add use1r";
    }

}
