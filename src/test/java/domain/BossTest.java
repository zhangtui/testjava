package domain;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookingServices;
import service.impl.QunarBookingServicelmp;

/**
 * Created by 张瑞 on 2019/3/21.
 */
public class BossTest {
    @Test
    public void booking() {
        Boss boss = new Boss();
        //  -----助理获取秘书的角色就是springioc
        BookingServices bookingServices = new QunarBookingServicelmp();
        boss.setBookingServices(bookingServices);
        boss.booking();

//        BookingServices bookingServices = new MeiTuanBookingServiceImlp();
//        boss.booking(bookingServices);

//        boss.booking(true);
    }
    @Test
    public void springBySpring(){
        ApplicationContext context =new ClassPathXmlApplicationContext("ioc.xml");
        Boss boss = context.getBean("boss",Boss.class);
        boss.booking();
    }

}