package com.dunzung.java.spring.service.impl;

import com.dunzung.java.spring.common.mybatisplus.service.impl.MybatisServiceImpl;
import com.dunzung.java.spring.entity.RoleEntity;
import com.dunzung.java.spring.mapper.RoleMapper;
import com.dunzung.java.spring.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 角色 Service
 *
 * @author 段志军
 * @since 2020-11-24
 */
@Slf4j
@Service
public class RoleServiceImpl extends MybatisServiceImpl<RoleMapper, RoleEntity> implements RoleService {

}
