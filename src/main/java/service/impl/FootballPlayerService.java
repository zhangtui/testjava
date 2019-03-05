package service.impl;

import service.PlayerService;

/**
 * Created by 张瑞 on 2019/3/5.
 */
public class FootballPlayerService implements PlayerService{
    @Override
    public void play(){
        System.out.println("足球训练方法");
    }
}
