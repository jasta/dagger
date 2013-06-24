package com.example.dagger.simple.dummy;

public class ConcreteDummyClass63 implements DummyClass63 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
