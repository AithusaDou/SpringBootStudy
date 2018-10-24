package com.example.book.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Picture {
    @Id
    @GeneratedValue
    private Integer id;
    private String pictureRoad;

    public Picture(String pictureRoad) {
        this.pictureRoad = pictureRoad;
    }
}

