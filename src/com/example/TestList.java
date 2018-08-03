package com.example;

import java.util.LinkedList;

/**
 * Created by ttnd on 26/5/18.
 */
public class TestList {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        //l.add(8);
        //l.add(9);
        System.out.println(l.get(l.size()-3));
    }
}
