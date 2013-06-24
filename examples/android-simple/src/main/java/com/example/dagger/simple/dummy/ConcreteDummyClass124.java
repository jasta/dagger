package com.example.dagger.simple.dummy;

public class ConcreteDummyClass124 implements DummyClass124 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
