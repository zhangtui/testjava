package domain;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 张瑞 on 2019/3/21.
 */
public class BossTest {
//    @Test
//    public void booking() {
//        BookingServices bookingServices = new QunarBookingServicelmp();
//        Boss boss = new Boss(bookingServices);
//        //  -----助理获取秘书的角色就是springioc
//        boss.setBookingServices(bookingServices);
//        boss.booking();
//
////        BookingServices bookingServices = new MeiTuanBookingServiceImlp();
////        boss.booking(bookingServices);
//
////        boss.booking(true);
//    }
    //spring 容器只需要执行一次，所以放到测试前置条件中
    public static ApplicationContext context;
    @BeforeClass
    public static void initSpring(){
        context = new ClassPathXmlApplicationContext("ioc.xml");
        System.out.println("开启容器");
    }
    @AfterClass
    public static void springClose(){
        System.out.println("关闭容器");
    }

    @Test
    public void springByFliggy(){
        Boss boss = context.getBean("boss",Boss.class);
        boss.booking();
    }
    @Test
    public void springByCtrip(){
        Boss boss = context.getBean("boss",Boss.class);
        boss.booking();
    }
    @Test
    public void springByMeituan(){}


}