package com.java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
    public static void main(String[] args) {
        EmployeePredicate e1=new EmployeePredicate("Rahul", 12);
        EmployeePredicate e2=new EmployeePredicate("Sourav", 72);
        EmployeePredicate e3=new EmployeePredicate("Sachin", 35);
        EmployeePredicate e4=new EmployeePredicate("Vijay", 55);
        List<EmployeePredicate> employeePredicateList=new ArrayList<>();
        employeePredicateList.addAll(Arrays.asList(new EmployeePredicate[]{e1, e2, e3, e4}));

        System.out.println(filterEmployees(employeePredicateList, isChild()));
        System.out.println(filterEmployees(employeePredicateList, isAdult()));
        System.out.println(filterEmployees(employeePredicateList, isGraterThenAge(70)));

    }

    public static Predicate<EmployeePredicate> isChild(){
        return p->p.getAge()<15;
    }

    public static Predicate<EmployeePredicate> isAdult(){
        return p->p.getAge()>25;
    }

    public static Predicate<EmployeePredicate> isGraterThenAge(int age){
        return p->p.getAge()>age;
    }

    public static List<EmployeePredicate> filterEmployees(List<EmployeePredicate> employeeList, Predicate<EmployeePredicate> predicate){
        return employeeList.stream().filter(predicate).collect(Collectors.toList());
    }
}
