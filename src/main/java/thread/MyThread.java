package thread;

/**
 * Created by 张瑞 on 2019/3/19.
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("线程");
    }
    public static void main(String[] args){
        MyThread myThread =new MyThread();
        myThread.start();
    }
}
