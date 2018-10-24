package com.example.quickstart.dao;

import com.example.quickstart.entity.Card;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 史冬阳 on 2018/9/17.
 */
@Configuration
@Data
public class CardDao {
    public List<Card> getCards(){
        Card[] cards = {
                new Card("a0.jpg","Tp","18小时前", "更加开放的社交网络，「长毛象」让你自由地分享想法","长毛象是一个开源的分散式社交网络，你可以在上面更加自由地分享你的看法，认识更多志同道合的新朋友。","0.png",17,9),
                new Card("a1.jpg","化学心情下2","2天前", "对产品和设计的热爱，让他打造出了这款 iOS 上的精美倒数日工具：专访 Time | 幕后","为了找到一款符合自己使用习惯的倒数日工具，Jony 开发了 Time 时间卡这款设计精美的 iOS 倒数日工具。本期幕后少数派就和开发者 Jony 聊了聊 Time 的设计思路，以及他对产品和设计的思考。","1.png",63,38),
                new Card("a2.jpg","Tp","2天前", "别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1","如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。","2.png",10,17),
                new Card("a3.jpg","洛世","09月05日", "工作日让家中电脑不再闲置，其实你可以遥控它做很多事","如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？\n","3.png",65,76),
                new Card("a4.jpg","waychane","09月05日", "告别死板与沉闷，试试这款像素风汇率查询工具：像素汇率 | App+1","支持现实货币与虚拟货币的像素风汇率换算应用，还可以查看汇率走势。","4.png",36,39),
                new Card("a0.jpg","Tp","18小时前", "更加开放的社交网络，「长毛象」让你自由地分享想法","长毛象是一个开源的分散式社交网络，你可以在上面更加自由地分享你的看法，认识更多志同道合的新朋友。","0.png",17,9),
                new Card("a1.jpg","化学心情下2","2天前", "对产品和设计的热爱，让他打造出了这款 iOS 上的精美倒数日工具：专访 Time | 幕后","为了找到一款符合自己使用习惯的倒数日工具，Jony 开发了 Time 时间卡这款设计精美的 iOS 倒数日工具。本期幕后少数派就和开发者 Jony 聊了聊 Time 的设计思路，以及他对产品和设计的思考。","1.png",63,38),
                new Card("a2.jpg","Tp","2天前", "别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1","如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。","2.png",10,17),
                new Card("a3.jpg","洛世","09月05日", "工作日让家中电脑不再闲置，其实你可以遥控它做很多事","如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？\n","3.png",65,76),
                new Card("a4.jpg","waychane","09月05日", "告别死板与沉闷，试试这款像素风汇率查询工具：像素汇率 | App+1","支持现实货币与虚拟货币的像素风汇率换算应用，还可以查看汇率走势。","4.png",36,39),

        };
        List<Card> cardList = Arrays.asList(cards);
        return cardList;
    }
}
