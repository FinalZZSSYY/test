package com.zsy.mapper;

import com.zsy.pojo.Users;

import java.util.List;

public interface UsersMapper {

    int insUser(Users users);
    List<Users> selUserAll();
}
