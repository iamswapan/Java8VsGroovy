package com.java8;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapVerification {
    public static void main(String[] args) {
        HashMap<Integer, String> test=new HashMap<>();

        test.put(1,"One");
        test.put(2,"Two");
        test.put(3,"Three");
        test.put(4,"Four");
        System.out.println(test.put(5, "Five"));
        for(Map.Entry<Integer,String> entry:test.entrySet()){
            System.out.println(entry.getKey()+"======="+entry.getValue());
        }

        Set<Integer> keyset=test.keySet();

        System.out.println(keyset);



    }
}
