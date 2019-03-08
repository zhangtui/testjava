package array;

import domain.Person;
import org.junit.Test;

/**
 * Created by 张瑞 on 2019/3/6.
 */
public class ArraysTest {
    @Test
    public void test1() {
        String[] arrays = new String[5];
        arrays[0] = "爱笑得女孩";
        arrays[1] = "旋律";
        arrays[2] = "小万";
        arrays[3] = "小a";
        arrays[4] = "simple";

        for(int i=0;i<arrays.length;i++){
            System.out.println(arrays[i]);
        }

        Person person = new Person();
    }


}
