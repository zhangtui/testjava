package service.impl;

import domain.Order;
import domain.Sku;
import service.OrderSubmit;

import java.util.List;

/**
 * Created by 张瑞 on 2019/3/5.
 */
public class OrderSubmitInml implements OrderSubmit{
    @Override
    public int pay(Order order){
        List<Sku> skuList = order.getSkuList();
        int m = order.getMoney();
        for(int i=0;i<skuList.size();i++){
            Sku sku = skuList.get(i);
            int price  = sku.getSkuPrice();
            m +=price;
        }
        System.out.println("价格："+m);
        return m;
    }
}
