package com.example.quartz.service;


import com.example.quartz.dao.SportsRepository;
import com.example.quartz.entity.Sports;
import com.example.quartz.entity.SportsUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceTest {
    @Resource
    private LoginService loginService;

    @Resource
    private SportsRepository sportsRepository;

    @Test
    public void get() {
        List<SportsUser> sportsUsers = loginService.get("1111","lalala");
        System.out.println(sportsUsers);
    }

    @Test
    public void check() {
        SportsUser sportsUser = loginService.check("1111","lalala");
        System.out.println(sportsUser);
    }

    @Test
    public void getAll() {
        List<Sports> sports = sportsRepository.findAll();
       sports.forEach(sport -> System.out.println(sport));


    }
}