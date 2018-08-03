package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ttnd on 26/11/16.
 */
public class Exercise5 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        list.stream()
                .filter(e-> e%2==0)
                .forEach(System.out::println);
        System.out.println("========================");
        System.out.println(list.stream()
                .filter(e -> e > 5)
                .collect(Collectors.summingInt(e -> e ))
        );
        System.out.println("========================");
        System.out.println(list.stream()
                        //.filter(e -> e > 5)
                        .collect(Collectors.averagingInt(e -> e * 2))
        );
        System.out.println("========================");
        System.out.println(list.stream()
                        .filter(e -> e > 3)
                        .findFirst().get()
        );
    }

}
