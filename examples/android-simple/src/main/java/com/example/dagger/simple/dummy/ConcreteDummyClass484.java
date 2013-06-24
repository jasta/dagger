package com.example.dagger.simple.dummy;

public class ConcreteDummyClass484 implements DummyClass484 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
