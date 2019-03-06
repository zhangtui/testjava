package domain;

/**
 * Created by 张瑞 on 2019/3/6.
 */
public class Rabbit extends Animal {
    //通过重现实现eat方法体现了重写
    @Override
    public void eat(){
        System.out.println("我是兔子我吃草");
    }
}
