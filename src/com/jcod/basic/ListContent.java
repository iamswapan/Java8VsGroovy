package com.jcod.basic;

import java.io.File;

/**
 * Created by ttnd on 9/3/17.
 */
public class ListContent {
    public static void main(String[] args) {
        File file = new File("//home/ttnd/Study");
        String[] files=file.list();
        System.out.println("List content of=="+file.getPath());
        for(String st : files){
            System.out.println(st);
        }

    }
}
