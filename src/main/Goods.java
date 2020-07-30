package main;

public class Goods {
    private GoodsType goodsType;
    private double price;
    private String name;

    public Goods(GoodsType goodsType, double price, String name) {
        this.goodsType = goodsType;
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }

    public boolean isPromotionGood(){
        for (PromotionGoods promotionGoods : PromotionGoods.values()){
            if (goodsType.name().equals(promotionGoods.name())){
                return true;
            }
        }
        return false;
    }
}
