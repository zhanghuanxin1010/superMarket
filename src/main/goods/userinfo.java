package main.goods;

import java.math.BigDecimal;
import java.util.List;

public class userinfo {

    private int ID;
    private int Integral;
    List<GoodsInfo> goodsList ;

    public userinfo( List<GoodsInfo> goodsList) {


        this.goodsList = goodsList;
    }

    //计算积分
    public int   BUYGoods()//list
    {

     for(int i=0;i<goodsList.size();i++)
     {
         int jifen=0;
        for(GoodsType gt: GoodsType.values()){
            String a=goodsList.get(i).getName();
            if(goodsList.get(i).getName().equals(gt.toString()))
            {
                BigDecimal bignum = new BigDecimal("2");
               jifen=(goodsList.get(i).getPrivce().multiply(bignum)).intValue();
             break;
            }
            else
            {
                jifen=(goodsList.get(i).getPrivce()).intValue();
            }
        }
         Integral+=jifen;

     }
        return Integral;
    }

}
