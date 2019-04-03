package service.impl;

import org.springframework.stereotype.Service;
import service.BookingServices;

/**
 * Created by 张瑞 on 2019/3/21.
 */
@Service
public class QunarBookingServicelmp implements BookingServices{

    public void booking(){
        System.out.println("我是去哪儿网平台");
    }
}
