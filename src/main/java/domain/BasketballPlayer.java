package domain;

/**
 * Created by 张瑞 on 2019/3/5.
 */
public class BasketballPlayer extends Player {
    BasketballPlayer(String name){
        super(name);
    }
    @Override
    public void play(){
        System.out.println("篮球训练");
    }
}
