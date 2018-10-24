package com.example.book.dao;

import com.example.book.entity.Picture;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by 98100 on 2018/10/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PictureRepositoryTest {
    @Resource
    private PictureRepository pictureRepository;
    @Test
    public void initData(){
        Picture[] pictures={
                new Picture("https://upload-images.jianshu.io/upload_images/6025817-5d871fd878491b48.JPEG?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new Picture("https://upload-images.jianshu.io/upload_images/6025817-5d871fd878491b48.JPEG?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new Picture("https://upload-images.jianshu.io/upload_images/2540948-ceb8ff463e53dbb1?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new Picture("https://upload-images.jianshu.io/upload_images/2540948-ceb8ff463e53dbb1?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),


        };
        for (int i=0;i<pictures.length;i++){
            pictureRepository.save(pictures[i]);
        }
    }


}