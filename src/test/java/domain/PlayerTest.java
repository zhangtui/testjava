package domain;

import org.junit.Test;

/**
 * Created by 张瑞 on 2019/3/5.
 */
public class PlayerTest {
    @Test
    public void PlayerTest1(){
        Player basketballPlayer = new BasketballPlayer("篮球运动员");
//        System.out.println(player.getName());
//        player.play();

        Player pingpangPlayer = new PingpangPlayer("乒乓球运动员");
//        System.out.println(pingpangPlayer.getName());
//        pingpangPlayer.play();
        // 定义了一个标准
        //不管你是乒乓球运动员，还是篮球运动员，你可以使用我得name
        //和play（）方法，如果你要集成得话，必须重写你得play方法
        // 训练方法是共性得东西，但是因为运动员得种类不通，训练方式不能相同
        // 所以你要重写了，那么重写得规则使用抽象类和抽象方法定义
        // 我们都是运动员，我们都需要训练，对外暴露的就是运动员，然后我们要训练

        this.play(pingpangPlayer);
    }

    private void play(Player player){
        player.play();
    }
}
