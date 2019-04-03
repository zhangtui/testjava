package dao.impl;

import dao.IUserDao;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

/**
 * Created by 张瑞 on 2019/3/21.
 * 注解去配置
 */
@Component
public class UserDao implements IUserDao {

    @Override
    public void addUserName(String userName) {

        System.out.println(userName);
    }
    //注解的初始化
    @PostConstruct
    public void initUser(){
        System.out.println("构造方法之后执行，初始化");
    }
    //注解销毁返回
    @PreDestroy
    public void destory(){
        System.out.println("销毁之前执行");
    }
    @Override
    public Map<String, String> getUserByName(String userName) {
        return null;
    }
}
