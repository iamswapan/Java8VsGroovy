package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Super {
    static int var1=1234;
    static { System.out.println("Super "); }
}
class One {
    static { System.out.println("One "); }
}
class Two extends Super {
    static { System.out.println("Two "); }
}


public class ClassInitialization {
    public static void main(String[] args) {
        /*One o = null;
        Two t = new Two();
        System.out.println((Object)o == (Object)t);*/

        System.out.println(Two.var1);

        List<Integer> al=new ArrayList<Integer>();
        al.add(5);
        al.add(15);
        al.add(25);
        al.add(35);
        al.add(45);
        for(Integer a:al){
            System.out.println("==========="+a);
            al.remove(2);
        }
        //al.remove(2);
        System.out.println(al);



    }
}
