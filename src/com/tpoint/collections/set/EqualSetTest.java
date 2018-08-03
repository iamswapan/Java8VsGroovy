package com.tpoint.collections.set;


import java.util.HashSet;
import java.util.Set;

public class EqualSetTest {
    public static void main(String[] args) {
        Set mySet=new HashSet<>();
        Set newMySet=new HashSet<>();

        System.out.println(mySet.add("ab"));
        System.out.println(mySet.add("CD"));
        mySet.add("AB");

        newMySet.add("AB");
        newMySet.add("cd");

        System.out.println(mySet);
        System.out.println(newMySet);
        System.out.println(mySet.equals(newMySet));
    }
}
