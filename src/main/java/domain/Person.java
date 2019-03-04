package domain;

/**
 * Created by 张瑞 on 2019/3/4.
 */
public class Person {
    private String name;
    private int age;
    Person(){}

    Person(String name){this.name = name;}

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }
    public void showInfo(){

    }
}
