package com.java8;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by ttnd on 25/4/18.
 */
public class MethodRef {
    public static void main(String[] args) {
        MethodRef obj1=new MethodRef();
        obj1.publicMethod();

        obj1.streamTest();


    }

    public void streamTest(){
        /*int sum=Stream.of("1","2","3","4","5","6")
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println(sum);*/
    }

    public void printLowerCase(String s) {
        System.out.println(s.toLowerCase());
    }
    public static void printUpperCase(String s) {
        System.out.println(s.toUpperCase());
    }
    public void publicMethod() {
        /*List<String> list = Arrays.asList("A", "B", "C");
        System.out.println("==================================");
        list.forEach(this::printLowerCase);
        System.out.println("==================*****************================");
        list.forEach(MethodRef::printUpperCase);
        System.out.println("================###################==================");
        list.forEach(String::toLowerCase);
        System.out.println("================@@@@@@@@@@@@@@@@@@@@@==================");*/
        //list.forEach(String::new);

        ArrayList<String> ar1=new ArrayList();
        ar1.add("a");
        ar1.add("b");
        ar1.add("c");

        ArrayList<String> ar2=new ArrayList();
        ar2.add("a");
        ar2.add("c");

        System.out.println(Collections.disjoint(ar2, ar1));


    }
}
