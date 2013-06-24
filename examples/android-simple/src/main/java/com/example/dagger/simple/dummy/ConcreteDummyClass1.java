package com.example.dagger.simple.dummy;

public class ConcreteDummyClass1 implements DummyClass1 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
