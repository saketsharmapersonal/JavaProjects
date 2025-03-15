package org.example.locking;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReadWriteLock;

public class SharedResourceSemaphoreLock {
    boolean isAvailable=false;
    Semaphore lock = new Semaphore(2);
    public void producer(){

        try {
            lock.acquire();
            System.out.println("Semaphore Lock Acquired by : " + Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println("Exception"+e);
        }
        finally {
            lock.release();
            System.out.println("Semaphore Lock Released by: "+ Thread.currentThread().getName());

        }
    }

    public void consumer(ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println("Write Lock Acquired by : " + Thread.currentThread().getName());
            isAvailable=false;
        }catch(Exception e){

        }finally {
            lock.writeLock().unlock();
            System.out.println("Write Lock Released by : " + Thread.currentThread().getName());
        }
    }
}
