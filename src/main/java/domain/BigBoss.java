package domain;

import org.springframework.beans.factory.annotation.Autowired;
import service.BookingServices;
import service.impl.FliggyBookingServicelmpl;
import service.impl.MeiTuanBookingServiceImlp;
import service.impl.QunarBookingServicelmp;

/**
 * Created by 张瑞 on 2019/3/29.
 */
public class BigBoss {
    @Autowired //1、通过成员变了进行注入属性
    private FliggyBookingServicelmpl fliggyBookingServicelmpl;
    private QunarBookingServicelmp qunarBookingServicelmp;
    private MeiTuanBookingServiceImlp meiTuanBookingServiceImlp;

    BigBoss(){};
    @Autowired //3、通过构造方法进行注入
    BigBoss(MeiTuanBookingServiceImlp meiTuanBookingServiceImlp){
        this.meiTuanBookingServiceImlp=meiTuanBookingServiceImlp;
    }
    public FliggyBookingServicelmpl getFliggyBookingServicelmpl() {
        return fliggyBookingServicelmpl;
    }
    public void setFliggyBookingServicelmpl(FliggyBookingServicelmpl fliggyBookingServicelmpl) {
        this.fliggyBookingServicelmpl = fliggyBookingServicelmpl;
    }

    public QunarBookingServicelmp getQunarBookingServicelmp() {
        return qunarBookingServicelmp;
    }
    @Autowired //2、通过方法进行注入属性
    public void setQunarBookingServicelmp(QunarBookingServicelmp qunarBookingServicelmp) {
        this.qunarBookingServicelmp = qunarBookingServicelmp;
    }

    public MeiTuanBookingServiceImlp getMeiTuanBookingServiceImlp() {
        return meiTuanBookingServiceImlp;
    }

    public void setMeiTuanBookingServiceImlp(MeiTuanBookingServiceImlp meiTuanBookingServiceImlp) {
        this.meiTuanBookingServiceImlp = meiTuanBookingServiceImlp;
    }

    public BookingServices getBookingServices() {
        return bookingServices;
    }

    public void setBookingServices(BookingServices bookingServices) {
        this.bookingServices = bookingServices;
    }

    private BookingServices bookingServices;

    public void booking(){
        fliggyBookingServicelmpl.booking();
    }
}
