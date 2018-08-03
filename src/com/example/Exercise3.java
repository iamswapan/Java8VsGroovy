package com.example;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by ttnd on 26/11/16.
 */
public class Exercise3 {
    public static void main(String[] args) {
        Consumer<String> consumer=(String e)-> {
            System.out.println(e+" test string");};
        consumer.accept("TTN");

        //////////////////
        Supplier<Integer> supplier=()->{return(2);};
        System.out.println(supplier.get());

        Predicate<Integer> predicate=(e)->(e>1);
        System.out.println(predicate.test(5));

        Function<Integer, Integer> function=(e)->e*5;
        System.out.println(function.apply(9));

    }
}
