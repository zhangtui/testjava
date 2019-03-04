package domain;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 张瑞 on 2019/2/28.
 */
public class ConstructorClassTest {
    @Test
    //测试构造方法类,测试类默认有个构造方法，如果声明了一个构造方法，就会覆盖默认的构造方法
    public void constructorTest(){
        int initage = 18;
        ConstructorClass constructorClass = new ConstructorClass(initage);
        int age = constructorClass.getAge();
        Assert.assertEquals("测试年龄的校验",19,age);
        System.out.println(age);

    }
    @Test
    public void constructorClassTest1(){
        ConstructorClass constructorClass = new ConstructorClass();

    }
}
