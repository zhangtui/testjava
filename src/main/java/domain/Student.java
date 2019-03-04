package domain;

/**
 * Created by 张瑞 on 2019/3/4.
 */
public class Student extends Person{

    private int sex;
    Student(){}
    Student(String name, int age,int sex){
        super(name,age);
        this.sex = sex;
    }
    @Override
    public  void showInfo(){
        System.out.println(this.getSex()+","+this.getName()+","+this.getAge());

    }
    public void studyJava(){
        System.out.println("学习JAVA");
    }
    public int getSex(){
        return sex;
    }
    public void setSex(int sex){
        this.sex = sex;
    }
}
