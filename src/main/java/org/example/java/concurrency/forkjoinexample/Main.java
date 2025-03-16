package org.example.java.concurrency.forkjoinexample;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        int proc = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of available core in the processor is: "
                + proc);


        long[] array = new long[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(array, 0, array.length);
        Long result = pool.invoke(task);

        System.out.println("Number of active thread after invoking: "
                + pool.getActiveThreadCount());
        System.out.println("Common Pool Size is: "
                + pool.getPoolSize());
        System.out.println("Result: " + result);
    }
}