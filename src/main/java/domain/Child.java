package domain;

/**
 * Created by 张瑞 on 2019/3/4.
 */
public class Child extends Person {
    //当父类没有默认的构造方式时，子类需要声明一个构造方法，用super 定义调用父类的构造方法。
    Child(String name){
        super(name);
    }
    @Override   //注解，重写
    public void setName(String name){
        System.out.println("我终于又名字了");
        super.setName(name);
        this.setName(name);
    }
    //super  只能时子类中使用，调用的都是父类的方法，this调用的是子类本身的方法，如果子类中没有申明方法，衍生调用父类的方法
    public void play(){
        System.out.println("我是孩子，我喜欢玩");
    }
}
