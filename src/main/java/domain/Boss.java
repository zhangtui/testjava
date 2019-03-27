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
