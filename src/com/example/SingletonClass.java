package com.example;


class SingletonClass {
    int a;
    private SingletonClass(){}
    private static SingletonClass instance = null;
    public static SingletonClass getInstance(){
        if(instance == null){
            synchronized(SingletonClass.class) {
                instance = new SingletonClass();
            }
        }
        return instance;
    }
    public int getValue(int b) {
        try {
            a = b;
            System.out.println("going to sleep with val="+b);
            Thread.sleep(100);
            System.out.println("wake up with val="+b);
        } catch (Exception e){}
        /*a = b;*/
        System.out.println(this);
        return a;
    }
}
class TestClass {
    public static void main(String[] arg) {
        SingletonClass sc = SingletonClass.getInstance();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Expected is 10 but value is "+sc.getValue(10));
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Expected is 20 but value is "+sc.getValue(20));
            }
        });
        t2.start();
    }
}
