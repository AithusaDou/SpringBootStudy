package com.example.quickstart.dao;

import com.example.quickstart.entity.Subject;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 史冬阳 on 2018/9/17.
 */
@Configuration
@Data
public class SubjectDao {
    public List<Subject> getSubjects(){
        Subject[] subjects = {
                new Subject("11.jpg","跑步好搭档"),
                new Subject("12.jpg","给现代人的护眼小技巧"),
                new Subject("13.png","青年居家生活指南"),
                new Subject("14.png","你知道的PPT技巧"),
        };
        List<Subject> subjectList = Arrays.asList(subjects);
        return subjectList;
    }
}
