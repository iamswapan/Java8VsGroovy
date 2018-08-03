package com.example;

class ParentTest {
    ParentTest(){
        printThree();
    }

    void printThree(){
        System.out.println("three");
    }
}

public class DynamicDispatch extends ParentTest {
    int three = (int)Math.PI;  // That is, 3
    void printThree() {
        System.out.println(three);
    }
}

class TestMain{
    public static void main(String[] args) {

        ParentTest p=new DynamicDispatch();
        p.printThree();
    }
}