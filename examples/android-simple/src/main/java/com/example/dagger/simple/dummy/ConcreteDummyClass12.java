package com.example.dagger.simple.dummy;

public class ConcreteDummyClass12 implements DummyClass12 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
