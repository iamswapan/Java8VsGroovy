package com.tpoint.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ttnd on 5/9/17.
 */
public class ArrayListInternal {
    public static void main(String[] args) {
        ////default array list has size zero of elementData array,
        ArrayList list0=new ArrayList();
        System.out.println(list0.size());

        ////default array list has size six of elementData array,
        /*ArrayList list6=new ArrayList(6);
        System.out.println(list6.size()+"====");
        list6.add(1);
        list6.add(2);
        list6.add(3);
        System.out.println(list6.size() + "====");
        list6.add(4);
        list6.add(5);
        list6.add(99);
        list6.add(199);
        System.out.println(list6.size() + "====");
        System.out.println(list6);
        System.out.println(33>>1);*/

        /*int a=10;
        System.out.println(Integer.toBinaryString(a));
        a=a>>1;
        System.out.println(Integer.toBinaryString(a));
        a=a>>1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);*/

        int[] intArr=new int[10];


        System.out.println("=======================");
        for(int i=0; i<intArr.length-1;i++){
            intArr[i]=i;
            System.out.println(intArr[i]);
        }

        System.arraycopy(intArr, 3, intArr, 4, (intArr.length-1)-3);
        System.out.println("=======================");
        intArr[3]=20;

        for(int i=0; i<intArr.length;i++){
            System.out.println(intArr[i]);
        }
        /*int count=0;
        System.out.println("list=====*******====="+list6);

        System.out.println("Iterator ============================");
        for(Iterator itr=list6.iterator(); itr.hasNext();){
            System.out.println(itr.next());
            //list6.remove(5);
            if(count==3)
            itr.remove();
            count++;
        }
        System.out.println("list=========="+list6);*/
    }
}
