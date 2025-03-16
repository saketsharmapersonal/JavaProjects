package org.example.java.locking;
import java.util.concurrent.locks.StampedLock;

public class SharedResourceStampedLock {
    int a=10;
    StampedLock lock = new StampedLock();
    public void producer(){
        long stamp = lock.tryOptimisticRead();
        try {
            System.out.println("Read Lock Acquired by : " + Thread.currentThread().getName());
            int a=11;
            Thread.sleep(8000);
            if(lock.validate(stamp)){
                System.out.println("Update Successful");
            }else{
                System.out.println("Rollback");
                 a=10;
            }
        }catch (Exception e){
            System.out.println("Exception"+e);
        }

    }

    public void consumer(){
        long stamp = lock.writeLock();
        System.out.println("Write lock acquired by:"+ Thread.currentThread().getName());
        try{

            System.out.println("Performing update");
            a=9;
        }catch(Exception e){

        }finally {
            lock.unlock(stamp);
            System.out.println("Write Lock Released by : " + Thread.currentThread().getName());
        }
    }
}
