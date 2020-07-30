package main.goods;

import java.math.BigDecimal;

public class GoodsInfo {

    private BigDecimal privce;

    public GoodsInfo(BigDecimal privce, String name) {
        this.privce = privce;
        this.name = name;
    }

    public BigDecimal getPrivce() {
        return privce;
    }

    public String getName() {
        return name;
    }

    public void setPrivce(BigDecimal privce) {
        this.privce = privce;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
