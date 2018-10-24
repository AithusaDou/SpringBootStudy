package com.example.quartz.service;


import com.example.quartz.entity.Sports;
import com.example.quartz.entity.SportsUser;

import java.util.List;

public interface LoginService {
    List<SportsUser> get(String account, String password);

    SportsUser check(String account, String password);


    List<Sports> getAll();
}
