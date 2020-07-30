package main;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是一个获取积分的类
 */
public class Points {

    public int getPoints(Goods goods) {
        if(goods.getPrice() > 1000){
            if (goods.isPromotionGood()){
                return 1000 * 2 + ((int)goods.getPrice() - 1000);
            } else {
                return 1000 + (int)((goods.getPrice()-1000) / 20);
            }
        } else {
            if (goods.isPromotionGood()){
                return (int) goods.getPrice() * 2;
            } else {
                return (int) goods.getPrice();
            }
        }
    }

    public int getPoints() {
        if (BuyGoods.isGoodsListAllPriceMorethan1000()){
            return getPointsWhenAllPriceMorethan1000();
        } else {
            return getPointsWhenAllPriceLessthan1000();
        }
    }

    private int getPointsWhenAllPriceMorethan1000() {
        double promotionPrice = BuyGoods.getBuyPromotionGoodsAllPrice();
        double notPromotionPrice = BuyGoods.getBuyNotPromotionGoodsAllPrice();
        if (promotionPrice > 1000){
            return (int)promotionPrice * 2 + (int)((notPromotionPrice + promotionPrice - 1000) / 20);
        } else if (promotionPrice < 1000 && promotionPrice > 0){
            return (int)promotionPrice * 2 + (int)(1000 - promotionPrice) + (int)((notPromotionPrice + promotionPrice - 1000) / 20);
        } else {
            return 1000 + (int)((notPromotionPrice - 1000) / 20);
        }
    }

    private int getPointsWhenAllPriceLessthan1000() {
        int points = 0;
        for (Goods goods : BuyGoods.buyGoodsList) {
            points += goods.isPromotionGood() ? (int) goods.getPrice() * 2 : (int) goods.getPrice();
        }
        return points;
    }
}
