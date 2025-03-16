package org.example.java.locking;

import java.util.concurrent.Semaphore;

public class MutexDemo {

    // create a Semaphore instance that makes it so only 1 thread can access resource at a time
    private static Semaphore mutex = new Semaphore(1);

    static class ThreadDemo extends Thread {

        private String name = "";

        public ThreadDemo(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                // check the above mentioned analogy in the article for reference
                System.out.println("How many people can buy a ticket at a time: " + mutex.availablePermits());
                System.out.println(name + " is buying a ticket...");
                mutex.acquire();
                try {
                    Thread.sleep(1000);

                    System.out.println(name + " is still buying a ticket. How many people can still buy the ticket alongside him: " + mutex.availablePermits());
                } finally {
                    mutex.release();
                    System.out.println(name + " bought the ticket.");
                    System.out.println("How many people can buy tickets after " + name + " has finished buying the ticket: " + mutex.availablePermits());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        ThreadDemo thread1 = new ThreadDemo("Bob");
        thread1.start();

        ThreadDemo thread2 = new ThreadDemo("Charlie");
        thread2.start();

        ThreadDemo thread3 = new ThreadDemo("Christie");
        thread3.start();

    }
}