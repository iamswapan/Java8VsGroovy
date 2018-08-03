package com.example;


interface I {
    int i = 1, ii = InterfaceInitilization.out("ii", 2);
}
interface J extends I {
    int j = InterfaceInitilization.out("j", 3), jj = InterfaceInitilization.out("jj", 4);
}
interface K extends J {
    int k = InterfaceInitilization.out("k", 5);
}

public class InterfaceInitilization {
    public static void main(String[] args) {
//        System.out.println(J.i);
        System.out.println(K.j);
    }
    static int out(String s, int i) {
        System.out.println(s + "=" + i);
        return i;
    }
}
