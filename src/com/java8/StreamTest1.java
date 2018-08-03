package com.java8;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");


        memberNames.stream().filter(s->s.startsWith("A")).forEach(System.out::println);

        List<String> filterName=memberNames.stream().filter((a) -> a.startsWith("S")).collect(Collectors.toList());
        System.out.println("============================");
        System.out.println(filterName);

        memberNames.stream().sorted().forEach(e->{
            e=e+" test";
            System.out.println(e);
        });
        System.out.println(memberNames);
    }
}
