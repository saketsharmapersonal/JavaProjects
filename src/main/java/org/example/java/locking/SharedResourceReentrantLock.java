package org.example.java.locking;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceReentrantLock {
    boolean isAvailable=false;

    public void producer(ReentrantLock lock){

        try {
            lock.lock();
            System.out.println("ReentrantLock Lock Acquired by : " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println("Exception"+e);
        }
        finally {
            lock.unlock();
            System.out.println("ReentrantLock Lock Released by: "+ Thread.currentThread().getName());
        }
    }
}
