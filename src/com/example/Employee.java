package com.example;

import java.lang.reflect.Field;

/**
 * Created by ttnd on 26/11/16.
 */
public class Employee {
    private String name;
    private int age;
    private int salary;
    private String myName;

    public Employee(){}

    public Employee(String name, int age, int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return this.name+"="+this.age+"="+this.salary;
    }

    public int getFieldCoun(){
        return getClass().getDeclaredFields().length;
    }
}

class EmployeeMain{
    public static void main(String[] args) {
        Employee e1=new Employee();
        System.out.println(e1.getFieldCoun());
        System.out.println(e1.getClass().getDeclaredFields());
        for(Field field:e1.getClass().getDeclaredFields()){
            System.out.println(field.getName());
        }
    }
}
