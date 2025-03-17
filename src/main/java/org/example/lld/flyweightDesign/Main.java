package org.example.lld.flyweightDesign;

public class Main {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        long maxMemory = runtime.maxMemory();
        long allocatedMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();

        long usedMemory = allocatedMemory - freeMemory;

        ILetter obj=LetterFactory.createLetter('a');
        obj.display(0,0);
        ILetter obj1=LetterFactory.createLetter('b');
        obj1.display(0,11);


        System.out.println("Max memory (bytes): After " + maxMemory);
        System.out.println("Allocated memory (bytes): After " + allocatedMemory);
        System.out.println("Free memory (bytes): After " + freeMemory);
    }
}
