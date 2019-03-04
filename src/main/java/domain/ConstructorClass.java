package domain;

/**
 * Created by 张瑞 on 2019/2/28.
 */
public class ConstructorClass {
    private int age;
    ConstructorClass(){};
    ConstructorClass(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
