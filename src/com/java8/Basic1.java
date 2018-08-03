package com.java8;


import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Basic1 {
    public static void main(String[] args) {
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Execute the thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finish the thread");
            }
        }).start();

        new Thread(()->{
            System.out.println("Another thread start");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Another thread end");
        }).start();

        List l1=new ArrayList<>();
        l1.add(5);
        l1.add(10);
        l1.add(15);
        l1.add(25);
        l1.forEach(System.out::println);
        l1.stream().collect(Collectors.toCollection(ArrayList::new));
        String en;
        try {
            en=URLEncoder.encode("cB6DN4YIU0ej/N6Yw7yRLQ==", "UTF-8");
            System.out.println(en);
        }catch (Exception e){

        }*/

        ArrayList al=null;
        System.out.println(al);
        if(true){
//            al=new ArrayList();
            Basic1 obj1=new Basic1();
            //al=obj1.setListValue(al);
        }
        System.out.println("==========="+al);

        String s1=new String("MOBILE_BROWSER");
        //String s2=new String("MOBILE");
        System.out.println(s1.contains("MOBILE"));
        System.out.println(s1.equalsIgnoreCase("Mobile"));

        if(s1.trim().equalsIgnoreCase("Mobile")){
            System.out.println("M");
        }else if(s1.trim().equalsIgnoreCase("Browser")){
            System.out.println("B");
        }else if(s1.trim().equalsIgnoreCase("Dongle")){
            System.out.println("D");
        }else if(s1.contains("DONGLE") && s1.contains("MOBILE")) {   //Mobile_Dongle
            System.out.println("D-M");
        } else if(s1.contains("BROWSER") && s1.contains("MOBILE")) {   //Mobile_Dongle
            System.out.println("B-M");
        } else if(s1.contains("DONGLE") && s1.contains("BROWSER")) {   //Mobile_Dongle
            System.out.println("D-B");
        }

    }
    public ArrayList setListValue(ArrayList al){
        al=new ArrayList<Integer>();
        al.add(5);
        al.add(15);
        al.add(25);
        al.remove(2);
        /*ArrayList<String> newal=new ArrayList<>();
        newal.add("one");
        newal.add("two");
        newal.forEach(a->{
            System.out.println(a+" test");
        });
        ArrayList newList=new ArrayList();
        al.forEach(a->{
            newList.add((int)a+2);
        });


        System.out.println(newList);*/

        return al;
    }


}
