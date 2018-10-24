package com.example.quartz.service;


import com.example.quartz.dao.SportsRepository;
import com.example.quartz.entity.Sports;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Slf4j
@Component
public class SportJob  {
    @Resource
    private SportsRepository sportsRepository;
    @Scheduled(cron = "40 14 2 * * ?")
    public void execute() throws Exception{
        Date date = new Date();
        Sports[] sports = {
                new Sports("6054",date,"1111"),
                new Sports("8243",date,"2222"),
                new Sports("5203",date,"3333"),
                new Sports("12344",date,"4444"),
                new Sports("8344",date,"5555"),
        };
        for (int i = 0 ; i < 5 ;i++){
            sportsRepository.save(sports[i]);
        }
    }
}
