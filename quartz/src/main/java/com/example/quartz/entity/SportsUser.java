package com.example.quartz.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class SportsUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String account;
    private String password;
    private String nickname;
    private String avatar;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    @JoinColumn(name = "sportUser_id")
    private List<Sports> steps = new ArrayList<>();
    public SportsUser(String account, String password, String nickname, String avatar) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.avatar = avatar;
    }

    public SportsUser() {
    }
}
