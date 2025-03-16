package org.example.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThreadPoolExample {
    public static void main(String[] args){

        ExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable runnableTask = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(300);
                System.out.println("Single Runnable Task");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        service.execute(runnableTask);
        service.shutdown();
    }
}
