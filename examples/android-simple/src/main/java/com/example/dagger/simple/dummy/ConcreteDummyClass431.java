package com.example.dagger.simple.dummy;

public class ConcreteDummyClass431 implements DummyClass431 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
