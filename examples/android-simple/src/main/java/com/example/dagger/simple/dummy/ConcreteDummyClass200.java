package com.example.dagger.simple.dummy;

public class ConcreteDummyClass200 implements DummyClass200 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
