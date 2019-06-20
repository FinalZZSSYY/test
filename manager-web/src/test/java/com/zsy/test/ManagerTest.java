package com.zsy.test;

import com.zsy.mapper.UsersMapper;
import com.zsy.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ManagerTest {

    @Resource
    private UsersMapper usersMapper;

    @Test
    public void insUserTest(){
        Users users = new Users();
        users.setUsername("指针");
        users.setPassword("123");
        this.usersMapper.insUser(users);
    }


}
