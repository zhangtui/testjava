package service;

import org.junit.Test;
import service.impl.FootballPlayerService;

/**
 * Created by 张瑞 on 2019/3/5.
 */
public class PlayerServiceTest {
    public void play(PlayerService playerService){
        playerService.play();
    }

    @Test
    public void test1(){
        play(new FootballPlayerService());
//        PlayerService playerService = new FootballPlayerService();
//        playerService.play();
    }
}
