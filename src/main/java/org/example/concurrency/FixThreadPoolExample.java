package org.example.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Queue size : Unbounded queue
 */
public class FixThreadPoolExample {

    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(5);

        // Creating 5 threads using loops
        for (int i = 0; i < 10; i++) {

            // Submitting task to service's execute method
            service.execute(() -> {
                // Printing and display the current thread
                // using curentThread() and getName() method
                System.out.println(
                        "Printing document by thread : "
                                + Thread.currentThread().getName());

                // Try block to check for exceptions
                try {

                    // Making threads to sleep for 1 second
                    // using the sleep() method
                    Thread.sleep(10000L);
                }

                // Catch block to handle the exceptions
                catch (InterruptedException e) {

                    // Print and display the line number
                    // where the exception occurred
                    e.printStackTrace();
                }
            });
        }
        service.shutdown();
    }
}
