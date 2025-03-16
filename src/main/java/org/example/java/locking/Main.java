package org.example.java.locking;


public class Main {

    public static void main(String[] args) {
        /*//1. Synchronized Monitor object lock

        SharedResource resource1 = new SharedResource();

        Thread th1 =new Thread(()->{
            resource1.producer();
        });

        SharedResource resource2 = new SharedResource();

        Thread th2 =new Thread(()->{
            resource2.producer();
        });
        th1.start();
        th2.start();



        //2.Reenter lock allowing only one object to lock shared object

        ReentrantLock lock = new ReentrantLock();
        SharedResourceReentrantLock resource3 = new SharedResourceReentrantLock();

        Thread th3 =new Thread(()->{
            resource3.producer(lock);
        });

        SharedResourceReentrantLock resource4 = new SharedResourceReentrantLock();

        Thread th4 =new Thread(()->{
            resource4.producer(lock);
        });
        th3.start();
        th4.start();*/

        /*3. Read-Write Lock (Shared-Exclusive Lock)
          Read lock : more than 1 thread can acquire the lock
          Lock lock : only 1 thread can write the lock
         */
        /*ReadWriteLock lockRW = new ReentrantReadWriteLock();
        SharedResourceReadWriteLock resource5 = new SharedResourceReadWriteLock();

        Thread th5 =new Thread(()->{
            resource5.producer(lockRW);
        });


        Thread th6 =new Thread(()->{
            resource5.producer(lockRW);
        });
        SharedResourceReadWriteLock resource6 = new SharedResourceReadWriteLock();
        Thread th7 =new Thread(()->{
            resource6.consumer(lockRW);
        });
        th5.start();
        th6.start();
        th7.start();*/

        //4. Stamped locking

        SharedResourceStampedLock stampedResource = new SharedResourceStampedLock();

        Thread th12 =new Thread(()->{
            stampedResource.producer();
        });


        Thread th13 =new Thread(()->{
            stampedResource.consumer();
        });
        th12.start();
        th13.start();

        //5. Semaphore locking
  /*      SharedResourceSemaphoreLock lockSemaphore = new SharedResourceSemaphoreLock();

        Thread th8 =new Thread(()->{
            lockSemaphore.producer();
        });


        Thread th9 =new Thread(()->{
            lockSemaphore.producer();
        });

        Thread th10 =new Thread(()->{
            lockSemaphore.producer();
        });

        Thread th11 =new Thread(()->{
            lockSemaphore.producer();
        });
        th8.start();
        th9.start();
        th10.start();
        th11.start();*/
    }


}
