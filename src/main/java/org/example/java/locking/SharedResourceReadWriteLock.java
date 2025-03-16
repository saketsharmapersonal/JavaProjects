package org.example.java.locking;
import java.util.concurrent.locks.ReadWriteLock;

public class SharedResourceReadWriteLock {
    boolean isAvailable=false;

    public void producer(ReadWriteLock lock){

        try {
            lock.readLock().lock();
            System.out.println("Read Lock Acquired by : " + Thread.currentThread().getName());
            Thread.sleep(8000);
        }catch (Exception e){
            System.out.println("Exception"+e);
        }
        finally {
            lock.readLock().unlock();
            System.out.println("Read Lock Released by: "+ Thread.currentThread().getName());

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
