package com.tpoint.collections.custom;

import java.util.Arrays;

/**
 * Created by ttnd on 6/9/17.
 */
public class MyArrayList<T> {
    private static final Integer DEFAULT_SIZE = 10;

    private static final Object[] EMPTY_LIST = {};

    private Object[] data;

    private int size;

    public MyArrayList() {
        data = EMPTY_LIST;
    }

    public MyArrayList(int size) {
        if (size > 0)
            data = new Object[size];
        else if (size == 0)
            data = EMPTY_LIST;
        else
            throw new IllegalArgumentException("Invalid array list size");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(T element) {
        validateCapacity(data.length + 1);
        data[this.size++]=element;
    }

    public void addSpecificPosition(int pos, T elem){
        validatePosition(pos);
        validateCapacity(this.data.length+1);
//        System.arraycopy(this.data, pos, this.data, pos+1, );
    }

    public void validatePosition(int pos){
        if(pos <0 || pos > this.data.length)
            throw new ArrayIndexOutOfBoundsException("Wrong position to insert the element");
    }

    private void validateCapacity(int capacity) {
        if (capacity == 1)
            capacity = DEFAULT_SIZE;
        if (capacity > data.length)
            resizeArrayList(capacity);
    }

    private void resizeArrayList(int capacity) {
        int oldCapacity=data.length;
        int newCapacity=oldCapacity+(oldCapacity/2);
        if(newCapacity<capacity){
            newCapacity=capacity;
        }
        data= Arrays.copyOf(data, newCapacity);
    }
}
