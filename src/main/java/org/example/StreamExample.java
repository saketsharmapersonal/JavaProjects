package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
        public static void main(String[] args) {

            //Streams
            List<Integer> salaryList = new ArrayList<>();
            salaryList.add(3000);
            salaryList.add(4000);
            salaryList.add(1000);
            salaryList.add(5500);

            long output=salaryList.stream().filter((Integer sal)->sal>3000).count();

            System.out.println("Total Employee of Salary!" + output);

            //1. From Collections
            List<Integer> salLst=Arrays.asList(3000,4000,5000,6000);
            Stream<Integer> streamFromIntegerList = salLst.stream();

            //2. From Array
            Integer[] salArray ={3000,4000,5000,6000};
            Stream<Integer> streamFromIntegerArray = Arrays.stream(salArray);

            //3. From Static Methods
            Stream<String> streamFromStaticMethods = Stream.of("HELLO","HOW ARE YOU","EVERY","DA");
            //streamFromStaticMethods.forEach(System.out::println);
            Stream<String> filteredStream=streamFromStaticMethods.filter((String name)->name.length()<=3);

            List<String> filteredNameList=filteredStream.collect(Collectors.toList());
           filteredNameList.forEach(System.out::println);


            System.out.println ("4. From Stream Builder");
            //4. From Stream Builder
            Stream.Builder<String> streamBuilder=Stream.builder();
            streamBuilder.add("Hello").add("How Are").add("YOu!");
            Stream<String> streamFromStreamBuilder = streamBuilder.build();
            Stream<String> lowerCaseStream = streamFromStreamBuilder.map((String name)->name.toLowerCase());
            lowerCaseStream.forEach(System.out::println);

            System.out.println ("5. From Stream Iterate");

            //5. From Stream Iterate
            Stream<Integer> streamFromIterate =Stream.iterate(1000, (Integer n)->n+5000).limit(5);
            streamFromIterate.forEach(System.out::println);




        }
    }

