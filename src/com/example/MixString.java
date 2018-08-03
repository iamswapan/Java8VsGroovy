package com.example;

/**
 * Created by ttnd on 2/12/16.
 */
public class MixString {
    public static void main(String[] args) {
        MixString obj1=new MixString();
        System.out.println(obj1.mixString("Hiasdfgzxy", "There"));
    }

    public String mixString(String a, String b){
        int i,j;
        String result="";
        StringBuilder sb=new StringBuilder();
        for(i=0, j=0; i<a.length() && j<b.length(); i++,j++){
            sb=sb.append(a.charAt(i)).append(b.charAt(j));
        }
        if(i<a.length()){
            sb.append(a.substring(i, a.length()));
        }
        if(j<b.length()){
            sb.append(b.substring(j, b.length()));
        }
        result=new String(sb);
        return result;
    }
}
