package com.example.dagger.simple.dummy;

public class ConcreteDummyClass19 implements DummyClass19 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
