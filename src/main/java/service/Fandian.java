package service;

/**
 * Created by 张瑞 on 2019/3/5.
 */
public class Fandian {
    public void eat(){
        System.out.println("随意，今天胃口不填好");
    }

    public void eat(String fish){
        System.out.println("我要吃"+fish);
    }

    public void eat(String fish,String ji){
        System.out.println("我要吃"+fish+"和"+ji);
    }

    public String rice(){
        return null;
    }
    public static void main(String[] args){
        new Fandian().eat();
        new Fandian().eat("鱼");
        new Fandian().eat("鱼","鸡");
    }
}
