package com.example.dagger.simple.dummy;

public class ConcreteDummyClass17 implements DummyClass17 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
