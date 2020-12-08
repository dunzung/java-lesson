package com.dunzung.java.spring.service.impl;

import com.dunzung.java.spring.common.mybatisplus.service.impl.MybatisServiceImpl;
import com.dunzung.java.spring.entity.UserEntity;
import com.dunzung.java.spring.mapper.UserMapper;
import com.dunzung.java.spring.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 用户 Service
 *
 * @author 段志军
 * @since 2020-11-24
 */
@Slf4j
@Service
public class UserServiceImpl extends MybatisServiceImpl<UserMapper, UserEntity> implements UserService {


}
