package domain;

/**
 * Created by 张瑞 on 2019/3/6.
 */
public class Animal {
    public void eat(){
        System.out.println("eat");
    }
    //sleep 通过入参的不同，体现了方法的重载
    public void sleep(int hour){
        System.out.println("我睡了"+ hour+"小时");
    }

    public void sleep(){
        System.out.println("sleep 5 hour");
    }
}
