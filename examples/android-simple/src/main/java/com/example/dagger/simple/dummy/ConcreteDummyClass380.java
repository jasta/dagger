package com.example.dagger.simple.dummy;

public class ConcreteDummyClass380 implements DummyClass380 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
