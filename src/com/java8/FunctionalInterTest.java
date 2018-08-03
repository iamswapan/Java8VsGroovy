package com.java8;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@FunctionalInterface
public interface FunctionalInterTest {
    public void first();
//    public void second();

    default void testDefault(){
        System.out.println("First default method");
    }

    default void anotherDefault(){
        System.out.println("Second default menthod");
    }

}


class FunctionalMain implements FunctionalInterface{

   /*public void first(){
       System.out.println("================");
   }*/

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    public static void main(String[] args) {
        String str="new";
        List l1=new ArrayList<>();

        Optional opt1=Optional.of(l1);
        Optional opt=Optional.ofNullable(str);
        System.out.println(opt.isPresent());
        System.out.println("============"+opt.orElse(5));

        opt.ifPresent(System.out::println);

        System.out.println(opt1.get());

        opt.filter(str1 -> str1.equals("new1")).orElse(5);




    }
}