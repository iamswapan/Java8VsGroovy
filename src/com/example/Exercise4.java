package com.example;

/**
 * Created by ttnd on 26/11/16.
 */

interface Parent{
    default void display(){
        System.out.println("Invoking parent display");
    }

    static void parentDisplay1(){
        System.out.println("Invoking parent display static");
    }
}

interface Child1 extends Parent{
    default void display(){
        System.out.println("Invoking child1 display");
    }

    static void child1Display1(){
        System.out.println("Invoking child1 display static");
    }
}

interface Child2 extends Parent{
    default void display(){
        System.out.println("Invoking child2 display");
    }

    static void child2Display1(){
        System.out.println("Invoking child2 display static");
    }
}

public class Exercise4 implements Child1, Child2 {
    public void display(){
        Child1.super.display();
        System.out.println("Invoking class");
    }
    public static void main(String[] args) {
        Child2.child2Display1();
        new Exercise4().display();
    }
}
