package domain;

/**
 * Created by 张瑞 on 2019/3/5.
 */
public class Sku {
    private String skuName;
    private String skuNumber;
    private int skuPrice;

    public int getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(int skuPrice) {
        this.skuPrice = skuPrice;
    }

    public String getSkuName() {
        return skuName;
    }
    public void setSkuName(String skuName){
        this.skuName = skuName;
    }

    public String getSkuNumber() {
        return skuNumber;
    }

    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber;
    }
}
