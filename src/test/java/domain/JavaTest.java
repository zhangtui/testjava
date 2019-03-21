package domain;

import org.junit.Test;

/**
 * Created by 张瑞 on 2019/3/20.
 */
public class JavaTest {
    @Test
    public void test(){
            int a=1;
            int b=3;
            switch (a+b){
                case 4:System.out.println("ssss");
            }
        }

    static int fun(int n){
        int t;
        if((n==0)||(n==1)){
            t=3;
        }else {
            t=n*fun(n-1);
        }
        return t;
    }
}
