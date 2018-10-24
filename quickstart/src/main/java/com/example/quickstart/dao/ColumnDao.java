package com.example.quickstart.dao;

import com.example.quickstart.entity.Column;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 史冬阳 on 2018/9/17.
 */
@Configuration
@Data
public class ColumnDao {
    public List<Column> getColumns(){
        Column[] columns = {
                new Column("21.png","玩转Workflow","Workflow 是 iOS 上一款被称为「效率神器」的 App，它以直观的卡片形式大大...","2018人关注"),
                new Column("22.png","提升效率之路","一个优秀的工具，能让你在提升效率之路事半功倍。你是如何通过这些工具，技...","1547人关注"),
                new Column("23.png","装了啥","你的手机装了哪些常见或小众的 App？它们如何帮你提高效率，给生活带来更多...","1238人关注"),
                new Column("24.png","我想推荐这个APP","你用过了哪些 App，爱上了哪些 App，无论平台，不妨现在就分享出来。","1053人关注"),
        };
        List<Column> columnList = Arrays.asList(columns);
        return columnList;
    }
}
