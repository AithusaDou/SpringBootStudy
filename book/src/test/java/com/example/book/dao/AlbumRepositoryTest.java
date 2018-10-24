package com.example.book.dao;

import com.example.book.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 98100 on 2018/9/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumRepositoryTest {
    @Resource
    private AlbumRepository albumRepository;

    @Test
    public void initData(){
        Album[] albums = {
          new Album("https://upload-images.jianshu.io/upload_images/4897291-d2b8fdc495a24d5a.jpeg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240",
                  "手绘",
                  "我喜欢的手绘",
                  1021),
          new Album("https://upload-images.jianshu.io/upload_images/13997428-1286e6a8d09923af.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240",
                  "阅读",
                  "我喜欢的图书",
                  3309),
          new Album("https://upload-images.jianshu.io/upload_images/13946786-87eda44abbb117b3.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240",
                  "电影",
                  "我喜欢的电影",
                  1222),
          new Album("https://upload-images.jianshu.io/upload_images/14237043-0910011cfe3e4c77.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240",
                  "摄影","我喜欢的摄影",5896),
          new Album("https://upload-images.jianshu.io/upload_images/2475086-84653cf9fc7e1dcb.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240",
                  "漫画","我喜欢的漫画",8524),
          new Album("https://upload-images.jianshu.io/upload_images/4255564-313e6f12a2ac83cc.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240",
                  "美食","我喜欢的食物",9013),
        };
        for (int i=0;i<6;i++){
            albumRepository.save(albums[i]);
        }
    }

    @Test
    public void findHotAlbums() throws Exception {
        List<Album> albums = albumRepository.findHotAlbum();
        albums.forEach(album -> System.out.println(album));
    }

}