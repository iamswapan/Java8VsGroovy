package com.example;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ttnd on 26/11/16.
 */
interface Fn1{
    int method1(int a, int b);
    //Employee createInstance(String n, int a, int s);
}

interface Fn2{
    //int method1(int a, int b);
    Employee createInstance(String n, int a, int s);
}

public class Exercise2 {
    public int add(int x, int y){
        return (x+y);
    }
    public int sub(int x, int y){
        return (x-y);
    }
    static public int mul(int x, int y){
        return (x*y);
    }
    public static void main(String[] args) {
        Exercise2 ex2=new Exercise2();
        Fn1 add=ex2::add;
        Fn1 sub=ex2::sub;
        Fn1 mul=Exercise2::mul;
        Fn2 createEmp=Employee::new;
        System.out.println("add="+add.method1(5,7));
        System.out.println("sub=" + sub.method1(5, 7));
        System.out.println("mul=" + mul.method1(5, 7));
        System.out.println(createEmp.createInstance("Swapan", 27, 90000));

        //////////////////////
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        int a=5;
        list.forEach(el-> el=el*2);
        list.forEach(el-> System.out.println(el));
        /////////////////////



    }
}
