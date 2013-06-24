package com.example.dagger.simple.dummy;

public class ConcreteDummyClass90 implements DummyClass90 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
