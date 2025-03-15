package org.example;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class ConcurrencyExample {

            public static void main(String[] args) {
                //1. Executor Service
                ExecutorService executor = Executors.newFixedThreadPool(2);
                executor.submit(() -> {
                    System.out.println("Task 1 running in thread: " + Thread.currentThread().getName());
                });
                executor.submit(() -> {
                    System.out.println("Task 2 running in thread: " + Thread.currentThread().getName());
                });
                executor.shutdown();


                //2. Scheduled Executor Service
                ScheduledExecutorService execServ
                        = Executors.newSingleThreadScheduledExecutor();

                Future<String> future1 = execServ.schedule(() -> {
                    System.out.println("Task 1 running in thread: Hello World " + Thread.currentThread().getName());
                    return "Hello World";
                }, 5, TimeUnit.SECONDS);

                Future<String> future2 = execServ.schedule(() -> {
                    System.out.println("Task 2 running in thread: Hello World " + Thread.currentThread().getName());
                    return "Hello World";
                }, 3, TimeUnit.SECONDS);

                ScheduledFuture<?> scheduledFuture = execServ.schedule(() -> {
                    System.out.println("Task 1 running in thread: Hello Friends " + Thread.currentThread().getName());
                },2, TimeUnit.SECONDS);

                execServ.shutdown();
                //3. Schedule at Fixed Rate
                ScheduledExecutorService scheduler
                        = Executors.newScheduledThreadPool(2);

                scheduler.scheduleAtFixedRate(() -> {
                    System.out.println("Task 1 running in thread: ScheduleAtFixedRate " + Thread.currentThread().getName());
                }, 1, 20, TimeUnit.SECONDS);

                scheduler.shutdown();
            }

    }
}