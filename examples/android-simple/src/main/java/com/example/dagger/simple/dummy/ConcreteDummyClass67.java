package com.example.dagger.simple.dummy;

public class ConcreteDummyClass67 implements DummyClass67 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
