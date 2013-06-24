package com.example.dagger.simple.dummy;

public class ConcreteDummyClass49 implements DummyClass49 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
