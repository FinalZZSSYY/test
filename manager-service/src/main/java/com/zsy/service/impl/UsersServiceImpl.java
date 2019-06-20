package com.zsy.service.impl;

import com.zsy.mapper.UsersMapper;
import com.zsy.pojo.Users;
import com.zsy.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public int addUser(Users users) {
        return usersMapper.insUser(users);
    }
}
