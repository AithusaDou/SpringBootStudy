package com.example.book.dao;

import com.example.book.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

/**
 * Created by 98100 on 2018/9/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Resource
    private UserRepository userRepository;
    public void initData() {
        //创建六条数据
        SysUser[] users = {
                new SysUser("dou@qq.com", "111", "豆", 15),
                new SysUser("doudou@qq.com", "222", "豆豆", 36),
                new SysUser("chen@qq.com", "333", "陈", 75),
                new SysUser("chenruiyue@qq.com", "444", "陈睿玥", 150),
                new SysUser("yueyue@qq.com", "555", "玥玥", 289),
                new SysUser("lala@qq.com", "666", "啦啦", 1056),
        };
        for (int i = 0; i < 6; i++) {
            userRepository.save(users[i]);
        }

    }

    @Test
    public void findByAccount() {
        SysUser sysUser = userRepository.findByAccount("dou@qq.com");
        System.out.println(sysUser);

    }

    @Test
    public void findByFansBetween(){
        List<SysUser> sysUsers = userRepository.findByFansBetween(0,100);
        sysUsers.forEach(sysUser -> System.out.println(sysUser));

    }

    @Test
    public void findByAll(){

    }
}