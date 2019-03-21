package domain;

/**
 * Created by 张瑞 on 2019/3/20.
 */
public class JavaTest {
    static int fun(int n){
        int t;
        if((n==0)||(n==1)){
            t=3;
        }
        else {
            t=n*fun(n-1);
        }
        return t;
    }
    public static void main(String[] args){
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.print(s1==s2);
        System.out.print(","+s1.equals(s2));
        int a=3,b=2;
        a*=b+8;
        float s = 0.33f;
        System.out.print(a);

        boolean flag = false;
        if(flag=true){
            System.out.println("true");
        }else {
            System.out.println("flase");
        }

        char ch='8'; int r=10;
        switch (ch+1){
            case '7':r=r+3;
            case '8':r=r+5;
            case '9':r=r+6;break;
            default:r=r+8;
        }
        System.out.print(r);
        char ch1='A',ch2='W';
        if(ch1+2<ch2){
            ++ch1;
        }System.out.print(ch1);
        System.out.print(ch2);
        int a1[] ={1,2,3,4,5};
        int a2[];
        float f[]={2.4f,3.5f,5.7f,7.8f};
        double d[] = new double[10];
    }

}
