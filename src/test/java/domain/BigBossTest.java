package domain;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 张瑞 on 2019/4/1.
 */
public class BigBossTest {
    public ApplicationContext context;
    @Before
    public void initApplication(){
        context = new ClassPathXmlApplicationContext("ioccannotation2.xml");
        context.getBean("bigBoss");
}
    @Test
    public void booking(){
        BigBoss bigBoss = context.getBean("bigBoss",BigBoss.class);
        bigBoss.booking();

    }

}