package main;

import java.util.ArrayList;
import java.util.List;

/**
 * 这个是顾客所购买的商品列表
 */
public class BuyGoods {
    public static List<Goods> buyGoodsList = new ArrayList<>();

    /**
     *
     * 获取已购买商品中的促销商品个数
     * @return
     */
    public static int getBuyPromotionGoodsNumber() {
        int number = 1;
        for (Goods goods : buyGoodsList){
            if (goods.isPromotionGood()){
                number ++;
            }
        }
        return number;
    }

    /**
     *
     * 获取已购买商品中的促销商品总价
     * @return
     */
    public static double getBuyPromotionGoodsAllPrice() {
        double price = 0.0;
        for (Goods goods : buyGoodsList){
            if (goods.isPromotionGood()){
                price += goods.getPrice();
            }
        }
        return price;
    }

    /**
     *
     * 获取已购买商品中的非促销商品总价
     * @return
     */
    public static double getBuyNotPromotionGoodsAllPrice() {
        double price = 0.0;
        for (Goods goods : buyGoodsList){
            if (!goods.isPromotionGood()){
                price += goods.getPrice();
            }
        }
        return price;
    }

    /**
     * 判断所购买的商品列表总价是否大于1000元
     */
    public static boolean isGoodsListAllPriceMorethan1000(){
        double allPrice = 0;
        for (Goods goods : buyGoodsList){
            allPrice += goods.getPrice();
        }
        return allPrice > 1000;
    }
}
