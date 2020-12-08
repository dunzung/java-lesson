package com.dunzung.java.spring.mapper;

import com.dunzung.java.spring.common.mybatisplus.mapper.DaoMapper;
import com.dunzung.java.spring.entity.RoleEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper extends DaoMapper<RoleEntity> {
}
