package test;

import main.BuyGoods;
import main.Goods;
import main.GoodsType;
import main.Points;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class supermarketTest {
    @Test
    public void should_return_100points_when_bug_apples_given_100yuan_apples(){
        //given
        BuyGoods.buyGoodsList = new ArrayList<>();
        Goods banana = new Goods(GoodsType.BANANA,100.00,"banana");
        BuyGoods.buyGoodsList.add(banana);
        Points points = new Points();

        //when
        int resultPoints = points.getPoints();

        //then
        assertEquals(100,resultPoints);
    }


    @Test
    public void should_return_100points_when_promotion_is_apple_watermelon_beef_given_10yuan_apples_30yuan_watermelon_20yuan_laundry(){
        //given
        BuyGoods.buyGoodsList = new ArrayList<>();
        Goods apples = new Goods(GoodsType.APPLE,10.00,"apple");
        Goods watermelon = new Goods(GoodsType.WATERMELON,30.00,"watermelon");
        Goods laundry = new Goods(GoodsType.LAUNDRY,20.00,"laundry");
        BuyGoods.buyGoodsList.add(apples);
        BuyGoods.buyGoodsList.add(watermelon);
        BuyGoods.buyGoodsList.add(laundry);
        Points points = new Points();

        //when
        int resultPoints = points.getPoints();

        //then
        assertEquals(100,resultPoints);
    }

    @Test
    public void should_return_1067points_when_promotion_is_apple_watermelon_beef_given_2350yuan_refrigerator(){
        //given
        BuyGoods.buyGoodsList = new ArrayList<>();
        Goods refrigerator = new Goods(GoodsType.REFRIGERATOR,2350.00,"refrigerator");
        BuyGoods.buyGoodsList.add(refrigerator);
        Points points = new Points();

        //when
        int resultPoints = points.getPoints();

        //then
        assertEquals(1067,resultPoints);
    }

    @Test
    public void should_return_3000points_when_promotion_is_tv_refrigerator_given_2000yuan_tv(){
        //given
        Goods tv = new Goods(GoodsType.TV,2000.00,"tv");
        Points points = new Points();

        //when
        int resultPoints = points.getPoints(tv);

        //then
        assertEquals(3000,resultPoints);
    }

    @Test
    public void should_return_1890points_when_promotion_is_tv_refrigerator_given_2800yuan_tv_and_(){
        //given
        BuyGoods.buyGoodsList = new ArrayList<>();
        Goods tv = new Goods(GoodsType.TV,800.00,"tv");
        Goods washer = new Goods(GoodsType.WASHER,2000.00,"washer");
        BuyGoods.buyGoodsList.add(tv);
        BuyGoods.buyGoodsList.add(washer);
        Points points = new Points();

        //when
        int resultPoints = points.getPoints();

        //then
        assertEquals(1890,resultPoints);
    }
}
