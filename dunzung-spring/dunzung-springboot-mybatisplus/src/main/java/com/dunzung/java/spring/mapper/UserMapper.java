package com.dunzung.java.spring.mapper;

import com.dunzung.java.spring.common.mybatisplus.mapper.DaoMapper;
import com.dunzung.java.spring.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends DaoMapper<UserEntity> {
}
