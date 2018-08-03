package com.jcod.basic;


import java.util.stream.IntStream;

import static java.lang.Math.sqrt;

public class StreamTestPrime {

    public boolean isPrime(int n){
        boolean stat;
        stat = n>1 && IntStream.rangeClosed(2, (int)sqrt(n)).noneMatch(e -> n % e == 0);
        System.out.println(n+"=++++==="+stat);
        return stat;
    }

    public int countPrimes(int min, int max){
        return (int)IntStream.range(min, max).parallel().filter(e->isPrime(e)).count();
    }

    public static void main(String[] args) {
        IntStream.range(2,9).forEach(System.out::println);
        System.out.println(IntStream.rangeClosed(5, 9).noneMatch(e->e%2==0));

        StreamTestPrime stp=new StreamTestPrime();
        //stp.isPrime(5);
        System.out.println("count===="+stp.countPrimes(2,9));
    }
}
