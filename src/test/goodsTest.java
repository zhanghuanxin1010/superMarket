package test;

import main.BuyGoods;
import main.Goods;
import main.GoodsType;
import main.Points;
import main.goods.GoodsInfo;
import main.goods.userinfo;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

//特价商品
public class goodsTest {
    @Test
    public void should_return_20points_when_bug_apples_given_10yuan(){
        //given
        GoodsInfo goodsInfo1=new GoodsInfo(new BigDecimal("10"),"APPLE");
        List<GoodsInfo> goodsList=new ArrayList();
        goodsList.add(goodsInfo1);
        userinfo user1=new userinfo(goodsList);
        //when
        int jifen=user1.BUYGoods();
        //then
        assertEquals(20,jifen);
    }



}
