package thread;

/**
 * Created by 张瑞 on 2019/3/19.
 */
public class PayProcessor {
    //这里就是电商的逻辑，对于开发来说，这里都是单线程
    public void pay(){
        //添加一个线程名字
        String name = Thread.currentThread().getName();
        System.out.println("支付订单,线程名字"+name);
    }
}
