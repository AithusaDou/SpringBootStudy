package com.example.quickstart.entity;

import lombok.Data;

/**
 * Created by 史冬阳 on 2018/9/17.
 */
@Data
public class Column {
    private String cpic;
    private String ctitle;
    private String ccontent;
    private String focus;

    public Column(String cpic, String ctitle, String ccontent, String focus) {
        this.cpic = cpic;
        this.ctitle = ctitle;
        this.ccontent = ccontent;
        this.focus = focus;
    }
}
