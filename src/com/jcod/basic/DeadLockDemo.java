package com.jcod.basic;


public class DeadLockDemo {
    public static final Object add=new Object();
    public static final Object sub=new Object();
    public static void main(String[] args) {
        AddThread addThread=new AddThread();
        SubThread subThread=new SubThread();
        addThread.start();
        subThread.start();
        System.out.println("Deadlock not occurred");

    }

    static class AddThread extends Thread{
        public void run(){
            synchronized (add){
                int a=10, b=5, c;
                c=a+b;
                System.out.println("Add thread===="+c);
                System.out.println("holding lock for add obj");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Add Thread:: waiting for add lock");
                synchronized (sub){
                    System.out.println("Add Thread:: holding sub lock");
                }
            }
        }
    }

    static class SubThread extends Thread{
        public void run(){
            synchronized (sub){
                int a=10, b=5, c;
                c=a-b;
                System.out.println("Sub thread===="+c);
                System.out.println("holding lock for Sub obj");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Sub Thread:: waiting for Sub lock");
                synchronized (add){
                    System.out.println("Sub Thread:: holding Add lock");
                }
            }
        }
    }

}

