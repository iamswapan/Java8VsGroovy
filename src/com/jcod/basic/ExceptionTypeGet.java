package com.jcod.basic;


public class ExceptionTypeGet {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException("test ARE");
//            throw new ArithmeticException("test AE");
        }catch (Exception ex){
            System.out.println(ex.getClass().getSimpleName());
        }
    }
}
