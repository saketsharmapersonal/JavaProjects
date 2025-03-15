package org.example.locking;


public class SharedResource {
    boolean isAvailable=false;

    public synchronized void  producer(){

        try {

            System.out.println("Synchronized Shared Lock Acquired by : " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println("Exception"+e);
        }
             System.out.println("Synchronized Shared lock Released by: "+ Thread.currentThread().getName());

    }
}
