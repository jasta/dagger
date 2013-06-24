package com.example.dagger.simple.dummy;

public class ConcreteDummyClass500 implements DummyClass500 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
