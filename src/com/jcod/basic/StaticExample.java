package com.jcod.basic;


public class StaticExample {
    /*static {
        System.out.println("Static bloc executed in main");
    }*/
    {
        System.out.println("call IIB");
    }

    public StaticExample(){
        //this(10);
        System.out.println("call default");
    }

    public StaticExample(int x){
        System.out.println("call parameterized"+x);
    }

    public static void main(String[] args) {
        //StaticComponents.staticVariable=20;
        //System.out.println("main method invoked");
        //StaticComponents.staticMethod();
        StaticExample obj=new StaticExample();
        StaticComponents obj1=new StaticComponents(5);
    }
}

class SuperClass{
    int i;

    public SuperClass(){
        System.out.println("Super class cons.");
    }
    public SuperClass(int i){
        System.out.println("Super class cons="+i);
    }
}


class StaticComponents extends SuperClass
{
    static int staticVariable;
    final int finalVariable;
    public StaticComponents(){
        System.out.println("Sub class cons.");
        finalVariable=1;
    }
    public StaticComponents(int j){
        System.out.println("Sub class cons="+j);
        finalVariable=2;
    }

    static
    {
        System.out.println("StaticComponents SIB");
        staticVariable = 10;
    }

    static void staticMethod()
    {
        System.out.println("From StaticMethod");
        System.out.println(staticVariable);
    }
}