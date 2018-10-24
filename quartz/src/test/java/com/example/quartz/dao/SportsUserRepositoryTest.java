package com.example.quartz.dao;

import com.example.quartz.entity.SportsUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SportsUserRepositoryTest {
    @Resource
    private SportsUserRepository sportsUserRepository;
    @Test
    public void initData(){
        SportsUser[] sportsUsers={
                new SportsUser("lalala","123456","lalala","https://upload.jianshu.io/users/upload_avatars/13931487/1cdea396-0c25-40a9-bedc-661390c41d12?imageMogr2/auto-orient/strip|imageView2/1/w/120/h/120"),
                new SportsUser("一粒算命先生儿","hiahiahia","啦啦啦","https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3797481993,1929347741&fm=27&gp=0.jpg"),
                new SportsUser("一树朱桦","hiahiahia","啦啦啦","https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3797481993,1929347741&fm=27&gp=0.jpg"),
                new SportsUser("桎梏","hiahiahia","啦啦啦","https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3797481993,1929347741&fm=27&gp=0.jpg"),
                new SportsUser("白宇","hiahiahia","啦啦啦","https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3797481993,1929347741&fm=27&gp=0.jpg"),
                new SportsUser("朱一龙","hiahiahia","啦啦啦","https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3797481993,1929347741&fm=27&gp=0.jpg"),
                new SportsUser("薛之谦","hiahiahia","啦啦啦","https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3797481993,1929347741&fm=27&gp=0.jpg"),
                new SportsUser("陈伟霆","hiahiahia","啦啦啦","https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3797481993,1929347741&fm=27&gp=0.jpg"),
                new SportsUser("马天宇","hiahiahia","啦啦啦","https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3797481993,1929347741&fm=27&gp=0.jpg"),
                new SportsUser("白敬亭","hiahiahia","啦啦啦","https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3797481993,1929347741&fm=27&gp=0.jpg"),

        };
        for(int i=0;i<sportsUsers.length;i++){
            sportsUserRepository.save(sportsUsers[i]);
        }
    }
}