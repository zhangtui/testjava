package domain;

import org.junit.Test;

/**
 * Created by 张瑞 on 2019/3/4.
 */
public class PersonTest {
    @Test
    public void childTest(){
        Child child = new Child("aaa");
        child.setName("甜枣");
        child.eat();
        child.play();
//        Child.age = 2;
    }
    @Test
    public void studentTest(){
        Student student = new Student("小啊",18,1);
//        student.setName("堂堂");
//        student.eat();
//        Student.age = 18;
        student.showInfo();

    }
//    @Test
//    public void workerTest(){
//        Worker worker = new Worker();
//        worker.setName("爱笑的女孩");
//        worker.eat();
//        System.out.println(worker.getName());
//        worker.studyJava();
//        worker.work();
//    }
    @Test
    public void personTest2(){
        Person person = new Person("sss");
        person.toString();
    }
}
