package com.example.dagger.simple.dummy;

public class ConcreteDummyClass300 implements DummyClass300 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
