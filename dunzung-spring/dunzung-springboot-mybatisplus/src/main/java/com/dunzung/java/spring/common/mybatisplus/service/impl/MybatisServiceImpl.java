package com.dunzung.java.spring.common.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dunzung.java.spring.common.mybatisplus.mapper.DaoMapper;
import com.dunzung.java.spring.common.mybatisplus.service.MybatisService;

public class MybatisServiceImpl<M extends DaoMapper<T>, T> extends ServiceImpl<M, T> implements MybatisService<T> {

}
