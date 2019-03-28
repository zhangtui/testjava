package domain;

import service.BookingServices;

/**
 * Created by 张瑞 on 2019/3/21.
 */
public class Boss {
    /**
     * 进行改造
     *
     * **/
    private BookingServices bookingServices;
    //构造函数
//    public Boss(){
//        this.bookingServices = new QunarBookingServicelmp();
//    }
    //不用构造函数使用get、set方法进行传参

    public BookingServices getBookingServices() {
        return bookingServices;
    }

    public void setBookingServices(BookingServices bookingServices) {
        this.bookingServices = bookingServices;
    }
    //给一个成员变量参数赋值，有两种方式：1、通过set 方法进行赋值 2、通过构造方法进行赋值
    Boss(BookingServices bookingServices){
        this.bookingServices = bookingServices;
    }

    //为测试ioc 的初始化函数和回调函数

    public void initMethod(){
        System.out.println("初始化操作");
    }
    public void closeMethod(){
        System.out.println("关闭方法le");
    }

    /**
     * 订机票2使用接口方式订
     * **/
    public void booking(){
        //这里面是不知道进来的是携程或者飞猪或者其他
        // 我是不需要做任何修改的
        //减少维护，代码更灵活，低耦合，扩展性更强
        bookingServices.booking();
    }


    /**
    * 订机票
    * */
//    public void booking(boolean qunar){
//        //去哪儿网预订
//        if(qunar) {
//            QunarBookingServicelmp qunarBookingServicelmp = new QunarBookingServicelmp();
//            qunarBookingServicelmp.booking();
//        }else {
//            FliggyBookingServicelmpl fliggyBookingServicelmpl = new FliggyBookingServicelmpl();
//            fliggyBookingServicelmpl.booking();
//        }
//    }
}
