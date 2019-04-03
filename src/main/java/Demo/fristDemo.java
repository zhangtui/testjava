package Demo;

/**
 * Created by 张瑞 on 2019/2/28.
 */
public class fristDemo {
    public static void main(String arys[]){
        System.out.println("hello word");
        int a = 1;
        int s = ++a;
        System.out.println(s);
        //简单判断写法
        int score = 60;
        String ss = score>=60? "及格":"不及格";
        System.out.println(ss);
        int i = testAoth(1);
        System.out.println(i);
        System.out.println(isEmall("617892256@qq.com"));

        char  ch1='A',ch2='W';

        if(ch1 + 2 < ch2 ){ ++ch1;}
        System.out.println(ch1);
        int[] my_Array;

        my_Array=new int[5];

        for(int count=0;count<=5;count++){

            System.out.println(my_Array[count]);
        }


    }
    public static int testAoth(int a){
        int i = 1;
        switch (a){
            case 1:
                i = a;
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("no is in arys");
        }
        return i;

    }
    //判断一个邮箱是否包含@  并且以.com结尾的
    public static boolean isEmall(String emall) {
        if (emall.contains("@") && emall.endsWith(".com")) {
            return true;
        } else {
            return false;
        }
    }
}
