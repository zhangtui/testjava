package dao.impl;

import dao.IUserDao;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by 张瑞 on 2019/3/21.
 */
public class UserDaoTest {
    @Test
    public void addUserName(){
        IUserDao iUserDao =new UserDao();
        iUserDao.addUserName("spring");
    }
    @Test
    public void iocTest(){
        //ClassPathXmlApplicationContext 相当于去运行时环境去找匹配文件 classpath
        //启动一个spring的容器，启动之后可以再总起里面获取bean
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        //getBean 相当于new 一个userDao对象，区别再于spring 启动得时候已经new好了
        IUserDao iUserDao = (IUserDao) context.getBean("userDao");
        iUserDao.addUserName("spring ioc");
    }
    @Test
    public void getUserName(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        IUserDao iUserDao= (IUserDao) context.getBean("userDao");
        Map<String,String>map = iUserDao.getUserByName("a");
        Assert.assertEquals("a",map.get("userName"));
        Assert.assertEquals("beijing",map.get("city"));
        Assert.assertEquals("jiangbian",map.get("address"));

    }
}
