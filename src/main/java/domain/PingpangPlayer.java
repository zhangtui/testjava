package domain;

/**
 * Created by 张瑞 on 2019/3/5.
 */
public class PingpangPlayer extends Player {
    PingpangPlayer(String name){
        super(name);
    }
    @Override
    public void play(){
        System.out.println("乒乓球训练");
    }
}
