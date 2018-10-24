package com.example.quickstart.entity;

import lombok.Data;

/**
 * Created by 史冬阳 on 2018/9/17.
 */
@Data
public class Subject {
    private String pic;
    private String stitle;

    public Subject(String pic, String stitle) {
        this.pic = pic;
        this.stitle = stitle;
    }
}
