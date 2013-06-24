package com.example.dagger.simple.dummy;

public class ConcreteDummyClass21 implements DummyClass21 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
