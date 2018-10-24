package com.example.book.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 98100 on 2018/10/2.
 */
@Entity
@Data
public class PictureList {
    @GeneratedValue
    @Id
    private Integer id;
    private String pictureTitle;
    private String pictureRoad;

    public PictureList(String pictureTitle, String pictureRoad) {
        this.pictureTitle = pictureTitle;
        this.pictureRoad = pictureRoad;
    }

    public PictureList() {
    }


}

