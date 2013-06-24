package com.example.dagger.simple.dummy;

public class ConcreteDummyClass442 implements DummyClass442 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
