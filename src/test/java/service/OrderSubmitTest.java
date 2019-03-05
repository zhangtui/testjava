package service;

import domain.Order;
import domain.Sku;
import org.junit.Assert;
import org.junit.Test;
import service.impl.OrderSubmitInml;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张瑞 on 2019/3/5.
 */
public class OrderSubmitTest {
    @Test
    public  void test1(){
        Order order = new Order();
        order.setOrderId(123);
        Sku sku = new Sku();
        sku.setSkuName("手机");
        sku.setSkuPrice(5);
        List list = new ArrayList();
        list.add(sku);

        order.setSkuList(list);

        OrderSubmit submit = new OrderSubmitInml();
        int returnPrice = submit.pay(order);
        Assert.assertEquals(5,returnPrice);

    }
    @Test
    public  void test2(){
        Order order = new Order();
        order.setOrderId(123);
        Sku sku = new Sku();
        sku.setSkuName("手机");
        sku.setSkuPrice(5);
        Sku sku1 = new Sku();
        sku1.setSkuName("电脑");
        sku1.setSkuPrice(10);
        List list = new ArrayList();
        list.add(sku);
        list.add(sku1);

        order.setSkuList(list);

        OrderSubmit submit = new OrderSubmitInml();
        int returnPrice = submit.pay(order);
        Assert.assertEquals(15,returnPrice);

    }
}
