package com.jcod.basic;


public class ShutDownHookDemo {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            final int final_i=i;
            System.out.println("i=="+i+"=="+final_i);
            if (final_i==4){
                System.out.println("max limit");
            }
        }

    }
}
