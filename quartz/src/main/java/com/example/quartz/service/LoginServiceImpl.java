package com.example.quartz.service;


import com.example.quartz.dao.LoginRepository;
import com.example.quartz.dao.SportsRepository;
import com.example.quartz.entity.Sports;
import com.example.quartz.entity.SportsUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginRepository loginRepository;

    @Resource
    private SportsRepository sportsRepository;


    @Override
    public List<SportsUser> get(String account, String password) {
        return loginRepository.findAll();
    }

    @Override
    public SportsUser check(String account, String password) {
        List<SportsUser> users = loginRepository.findAll();
        SportsUser user = new SportsUser();
        for (int i=0;i<users.size();i++){
            String name = users.get(i).getAccount();
            String pass = users.get(i).getPassword();
            if (name.equals(account)){
                if (pass.equals(password)){
                    user = users.get(i);
                }
            }
        }
        return user;
    }

    @Override
    public List<Sports> getAll() {
        return sportsRepository.findAll();
    }

}
