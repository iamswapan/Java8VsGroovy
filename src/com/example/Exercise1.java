package com.example;

import java.util.*;

/**
 * Created by ttnd on 26/11/16.
 */

interface FindMax{
    boolean find(int a, int b);
}

interface IncrementValue{
    int incr(int a);
}

interface ConcatString{
    String concat(String str1, String str2);
}

interface ConvertUpper{
    String upper(String str1);
}

public class Exercise1 {
    public static void main(String[] args) {
        FindMax findMax=(a,b)->{return (a>b?true:false);};
        System.out.println("First no is grater then second="+findMax.find(11,8));

        IncrementValue incr=(a)->(a+5);
        System.out.println("Incremented value="+incr.incr(4));

        ConcatString concatString=(str1, str2)->(str1+str2);
        System.out.println("String concat value="+concatString.concat("To The", " New"));

        ConvertUpper convertUpper=(str1)->(str1.toUpperCase());
        System.out.println("Upper case value="+convertUpper.upper("To The New"));

        ////////////////////////
        Employee e1=new Employee("Swapan", 27, 90000);
        Employee e2=new Employee("Sampa", 28, 80000);
        List<Employee> l1= Arrays.asList(e1, e2);
        Collections.sort(l1,(e11,e12)->{
            return e11.getAge()-e12.getAge();
        });
        ///////////////////////
    }
}
