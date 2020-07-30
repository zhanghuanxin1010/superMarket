package test;

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
    //没有特价商品
    @Test
    public void should_return_5points_when_bug_peach_given_5yuan(){
        //given
        GoodsInfo goodsInfo1=new GoodsInfo(new BigDecimal("5"),"peach");
        List<GoodsInfo> goodsList=new ArrayList();
        goodsList.add(goodsInfo1);
        userinfo user1=new userinfo(goodsList);
        //when
        int jifen=user1.BUYGoods();
        //then
        assertEquals(5,jifen);
    }
    //没有特价商品
    @Test
    public void should_return_25_points_when_bug_peach_and_apple_given(){
        //given
        GoodsInfo goodsInfo1=new GoodsInfo(new BigDecimal("5"),"peach");
        GoodsInfo goodsInfo2=new GoodsInfo(new BigDecimal("10"),"APPLE");

        List<GoodsInfo> goodsList=new ArrayList();
        goodsList.add(goodsInfo1);
        goodsList.add(goodsInfo2);
        userinfo user1=new userinfo(goodsList);
        //when
        int jifen=user1.BUYGoods();
        //then
        assertEquals(25,jifen);
    }


}
