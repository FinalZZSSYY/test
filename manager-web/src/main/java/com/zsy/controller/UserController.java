package com.zsy.controller;

import com.zsy.pojo.Users;
import com.zsy.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UsersService usersServiceImpl;

    @RequestMapping("addUser")
    public String addUser(Users users){
        int index = usersServiceImpl.addUser(users);
        if(index!=0){
            return "ok.jsp";
        }else {
            return "index.jsp";
        }
    }
}
