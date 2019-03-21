package thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 张瑞 on 2019/3/20.
 */
public class ThreadPool {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        MyRunnable myRunnable =new MyRunnable();
        for(int i=0;i<20;i++){
            executorService.execute(myRunnable);
        }
        System.out.println("主线程");
    }
}
