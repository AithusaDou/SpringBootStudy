package com.example.book.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 98100 on 2018/9/29.
 */
@Entity
@Data
public class Album {
    @GeneratedValue
    @Id
    private Integer id;
    private String albumCover;
    private String albumTitle;
    private String  albumDescription;
    private Integer likes;


    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "picture_id")

    private List<PictureList> pictureList = new ArrayList<>();


    public Album() {
    }

    public Album(String albumCover, String albumTitle, String albumDescription, Integer likes) {
        this.albumCover = albumCover;
        this.albumTitle = albumTitle;
        this.albumDescription = albumDescription;
        this.likes = likes;
    }
}
