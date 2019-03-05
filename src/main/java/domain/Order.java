package domain;

import java.util.List;

/**
 * Created by 张瑞 on 2019/3/5.
 */
public class Order {
    private  int orderId;
    private int money;

    private List<Sku> skuList;


    public List<Sku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<Sku> skuList) {
        this.skuList = skuList;
    }

    public int getOrderId(){
        return orderId;
    }
    public void setOrderId(int orderId){
        this.orderId = orderId;
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money = money;
    }
}
