package com.example.quartz.dao;

import com.example.quartz.entity.Sports;
import com.example.quartz.entity.SportsUser;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class SportsRepositoryTest {
@Resource
private SportsRepository sportsRepository;

    @Test
    public void find() {
        List<Sports> sports = sportsRepository.find();
        sports.forEach(sport -> System.out.println(sport));
    }

    @Test
    public void findUser() {
    }
}