package com.example.dagger.simple.dummy;

public class ConcreteDummyClass409 implements DummyClass409 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
