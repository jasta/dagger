package com.example.dagger.simple.dummy;

public class ConcreteDummyClass66 implements DummyClass66 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
