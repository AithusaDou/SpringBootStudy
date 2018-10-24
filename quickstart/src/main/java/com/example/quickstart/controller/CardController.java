package com.example.quickstart.controller;

import com.example.quickstart.dao.CardDao;
import com.example.quickstart.dao.ColumnDao;
import com.example.quickstart.dao.SubjectDao;
import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.Column;
import com.example.quickstart.entity.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 史冬阳 on 2018/9/17.
 */
@Controller
public class CardController {
    @Resource
    private CardDao cardDao;
    @Resource
    private SubjectDao subjectDao;
    @Resource
    private ColumnDao columnDao;

    @GetMapping("card")
    public String getAll(ModelMap map){
        List<Card> cardList = cardDao.getCards();
        List<Subject> subjectList = subjectDao.getSubjects();
        List<Column> columnList = columnDao.getColumns();

        //将数据模型加入视图
        map.addAttribute("cardList",cardList);
        map.addAttribute("subjectList",subjectList);
        map.addAttribute("columnList",columnList);

        return "card";
    }
}
