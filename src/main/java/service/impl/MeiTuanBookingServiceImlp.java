package service.impl;

import org.springframework.stereotype.Service;
import service.BookingServices;

/**
 * Created by 张瑞 on 2019/3/21.
 */
@Service
public class MeiTuanBookingServiceImlp implements BookingServices{
    @Override
    public void booking() {
        System.out.println("我是美团订票平台");
    }
}
