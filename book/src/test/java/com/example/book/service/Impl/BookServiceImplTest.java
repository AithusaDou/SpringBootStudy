package com.example.book.service.Impl;

import com.example.book.entity.Book;
import com.example.book.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by 98100 on 2018/9/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceImplTest {
    @Resource
    private BookService bookService;

    @Test
    public void save(){
        String[] names = {"顾城精选集", "我喜欢生命本来的样子", "莎士比亚戏剧全集", "城南旧事", "沉默的大多数"};
        String[] writers = {"顾城", "周国平", "威廉•莎士比亚", "林海音", "王小波"};
        String[] introductions = {"以“童话诗人”著称，用“黑色的眼睛”寻找光明；朦胧派的代表，与北岛、舒婷等开启了新中国诗歌的新时代；收入《一代人》等名篇。",
                "当面对爱、逆境、孤独、死亡、变故等人生大命题的时候，人应当保持在什么心理状态，是本书的意义所在。希望本书能为在繁杂的世界里找不到头绪的你，建立强大的灵魂世界。",
                "莎翁去世400周年特别纪念 27部悲喜剧传奇剧完整收录，原汁原味再现原著神韵，通俗易懂。教育部推荐新课标必读书，多所中学大学戏剧院校选修，严复梁启超鲁迅莫言推荐，易卜生契诃夫郭沫若曹禺老舍等深受影响。",
                "大师彩画人生，全彩珍藏版，20世纪中文小说百强之一， 直抵千万读者灵魂的童年离骚。",
                "倘能如我所愿，我的一生就算成功。为此也要去论是非，否则道理不给你明白，有趣的事也不让你遇到。我开始得太晚了，很可能做不成什么，但我总得申明我的态度，所以就有了这本书——为我自己，也代表沉默的大多数。"};
        String[] avatars = {"http://img3m9.ddimg.cn/66/12/23709279-1_b_1.jpg",
                "http://img3m0.ddimg.cn/28/30/24198400-1_b_4.jpg",
                "http://img3m3.ddimg.cn/55/22/24030523-1_b_2.jpg",
                "http://img3m2.ddimg.cn/86/10/25091042-1_b_2.jpg",
                "http://img3m1.ddimg.cn/74/30/23961341-1_l_2.jpg"};
        for (int i = 0; i < 5; i++) {
            Book book=new Book();
            book.setAvatar(avatars[i]);
            book.setName(names[i]);
            book.setWriter(writers[i]);
            book.setIntroduction(introductions[i]);
            System.out.println(bookService.save(book));
        }

    }

    @Test
    public void getAll() {
    }

    @Test
    public void get() {
    }

    @Test
    public void delete() {
    }

}