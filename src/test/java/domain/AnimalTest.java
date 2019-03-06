package domain;

import org.junit.Test;

/**
 * Created by 张瑞 on 2019/3/6.
 */
public class AnimalTest {
    @Test
    public void test(){
        //类的多态，父类指定子类对象，子类是一种父类的类型
        //通过父类类型引用指向子类的一个实例（new tiger）
        Animal rabbit = new Rabbit();
        rabbit.eat();
        rabbit.sleep();

        Animal tiger = new Tiger();
        tiger.eat();
        tiger.sleep(10);
    }
}
