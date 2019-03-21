package exception;

import org.junit.Test;

import java.io.*;

/**
 * Created by 张瑞 on 2019/3/18.
 */
public class ExceptionTest {
    @Test
    public void test(){
        Reader reader =null;
        BufferedReader bufferedReader = null;
        try{
            reader = new FileReader("e:\\domess\\er.txt");
            bufferedReader = new BufferedReader(reader);
            String sl = null;
            int length = sl.length();
            while ((sl=bufferedReader.readLine())!=null){
                System.out.println(sl);
            }
            bufferedReader.close();
            reader.close();
        }catch (FileNotFoundException f){
            System.out.println("出现找不到文件情况下执行这里");
        }catch (IOException io){
            System.out.println("当出现读取问题情况下执行这里");
        }catch (NullPointerException n){
            System.out.println("当出现空指针异常下执行这里");
        }catch (Exception e){
            System.out.println("当出现无法预知得一样，并且上面的都没有捕获的情况下执行这里");
        }finally {
            try {
                if(null!=reader){
                    reader.close();
                }
                if (null!=bufferedReader){
                    bufferedReader.close();
                }
            }catch (IOException i){
                i.printStackTrace();
            }finally {
                System.out.println("回收资源");
            }

        }
    }
    @Test
    public void throwsTest(){
        Reader reader = null;
        try {
            reader = getReader1();
        }catch (FileNotFoundException f){
            System.out.println("zhaobudaowenj ");
        }
        System.out.println("执行完成");
        //当出现异常的情况下，如果你没有try，catch 的情况下，妈妈会阻断你的代码执行
    }
    private Reader getReader1() throws FileNotFoundException{
        Reader reader =getReader();
        System.out.println("xiao wan 调用方法");
        return reader;
    }

    private Reader getReader() throws FileNotFoundException{
        Reader reader =null;
        reader = new FileReader("e:\\domess\\dsd.txt");
        return reader;
    }
    @Test
    public void accertMonthTest(){
        int month =15;

        try {
            assertMonth(month);
        }catch (AccsetException c) {
            c.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("执行完成");
    }
    /**
     * 自己分装一个断言月份的方法
     */
    public void assertMonth(int month) throws AccsetException{
        if(month<1 || month>12){
            throw new AccsetException("输入的月份异常，月份范围不对");
        }
    }

}
