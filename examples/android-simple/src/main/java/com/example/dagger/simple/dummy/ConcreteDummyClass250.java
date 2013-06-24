package com.example.dagger.simple.dummy;

public class ConcreteDummyClass250 implements DummyClass250 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
