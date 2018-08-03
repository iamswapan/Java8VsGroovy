package com.example.compo;

//import org.springframework.stereotype.Component;

//@Component(value = "Bike")
public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike Start");
    }

    @Override
    public void stop() {
        System.out.println("Bike stop");
    }
}
