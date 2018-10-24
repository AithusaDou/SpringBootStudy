package com.example.book.dao;

import com.example.book.entity.PictureList;
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
public class PictureListRepositoryTest {
    @Resource
    private PictureListRepository pictureListRepository;
    @Test
    public void initData(){
        PictureList[] pictureLists={
                new PictureList("钢笔画习作","https://upload-images.jianshu.io/upload_images/13971140-518b2a1c8b64ae44.jpeg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("梅花仕女图","https://upload-images.jianshu.io/upload_images/8366724-eaee8c31155e1688.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("幻想","https://upload-images.jianshu.io/upload_images/4897291-d2b8fdc495a24d5a.jpeg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("日常小绘","https://upload-images.jianshu.io/upload_images/9052875-0998928cd073f117.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("彩铅临摹","https://upload-images.jianshu.io/upload_images/10731918-188741ae5d4d3402.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("二十四节气之小寒","https://upload-images.jianshu.io/upload_images/3335960-a3638cd25e1d903e.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("我这一辈子（老舍）","https://upload-images.jianshu.io/upload_images/13997428-1286e6a8d09923af.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("梵高传（史蒂文·奈非）","https://upload-images.jianshu.io/upload_images/5857781-834e971ec50f3852.png?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),
                new PictureList("边城（沈从文）","https://upload-images.jianshu.io/upload_images/3782999-809cd6625b7687db.jpeg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240"),


        };
        for (int i=0;i<pictureLists.length;i++){
            pictureListRepository.save(pictureLists[i]);
        }
    }

}