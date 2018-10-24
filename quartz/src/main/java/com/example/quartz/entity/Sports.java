package com.example.quartz.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Sports {
    @Id
    @GeneratedValue
    private Integer id;
    private String number;
    private Date date;
    private String account;

    public Sports() {
    }

    public Sports(String number, Date date, String account) {
        this.number = number;
        this.date = date;
        this.account = account;
    }
}
