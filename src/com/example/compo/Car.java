package com.example.compo;

//import org.springframework.stereotype.Component;

//@Component
//@Primary
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("car start");
    }

    @Override
    public void stop() {
        System.out.println("car stop");
    }
}
