package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ttnd on 26/11/16.
 */
public class Exercise6 {
    public static void main(String[] args) {
        Employee e1=new Employee("Swapan", 27, 95000);
        Employee e2=new Employee("Sampa", 28, 70000);
        Employee e3=new Employee("Babu", 27, 95000);

        List<Employee> employeeList= Arrays.asList(e1,e2,e3);

        employeeList.stream()
                .sorted((e4,e5)->e4.getSalary()-e5.getSalary())
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println(employeeList.stream()
                .max((e4, e5) -> e4.getSalary() - e5.getSalary()));

        System.out.println(employeeList.stream()
                .min((e4,e5)->e4.getSalary()-e5.getSalary()));

    }
}
