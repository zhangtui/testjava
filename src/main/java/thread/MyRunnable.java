package thread;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张瑞 on 2019/3/19.
 */
public class MyRunnable implements  Runnable{
    @Override
    public void run(){
        PayProcessor payProcessor = new PayProcessor();
        payProcessor.pay();

//        System.out.println("我是子线程");
    }
    public static void main(String[] args){
        MyRunnable myRunnable =new MyRunnable();
//        Thread thread = new Thread(myRunnable);
//        Thread thread1 = new Thread(myRunnable);
//        //这里面创建了一个子线程，这里得start 代表得是线程的启动，执行都是run方法
//        thread.start();
//        thread1.start();
        System.out.println("我是主线程");

        List<Thread> threadList =new ArrayList<>();
        for(int i=0;i<12;i++){
            threadList.add(new Thread());
        }
        Thread thread = threadList.get(0);
        thread.start();

        int maxPoolSize = 26;
        //模拟请求27个请求进来
        //poolsize拿到当前的线程数量，如果poolsize《maxPoolsize
        //那么new Thread（），然后处理

    }

}
