package org.example;

import java.util.ArrayList;
import java.util.List;
@FunctionalInterface
interface ZeroParameter {
    void display();
}

@FunctionalInterface
interface Functional {
    int operation(int a, int b);
}
public class FunctionalInterfaceAndLambda {
    public static void main(String[] args)
    {
        // Lambda expression with zero parameters
        ZeroParameter zeroParamLambda = ()
                -> System.out.println(
                "This is a zero-parameter lambda expression!");

        // Invoke the method
        zeroParamLambda.display();

        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        List<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        // Using lambda expression to print all elements
        // of arrL

        System.out.println("Elements of the ArrayList : ");
        arrL.forEach(n -> System.out.println(n));

        // Using lambda expression to print even elements
        // of arrL
        System.out.println(
                "Even elements of the ArrayList : ");
        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });

        // Using lambda expressions to define the operations
        Functional add = (a, b) -> a + b;
        Functional multiply = (a, b) -> a * b;

        // Using the operations
        System.out.println(add.operation(6, 3));  // Output: 9
        System.out.println(multiply.operation(4, 5));  // Output: 20
    }
}
