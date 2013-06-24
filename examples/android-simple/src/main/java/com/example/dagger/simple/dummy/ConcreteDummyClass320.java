package com.example.dagger.simple.dummy;

public class ConcreteDummyClass320 implements DummyClass320 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
