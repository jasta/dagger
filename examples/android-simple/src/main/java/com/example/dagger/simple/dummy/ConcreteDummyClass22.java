package com.example.dagger.simple.dummy;

public class ConcreteDummyClass22 implements DummyClass22 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
