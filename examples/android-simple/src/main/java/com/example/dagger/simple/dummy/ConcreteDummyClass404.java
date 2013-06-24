package com.example.dagger.simple.dummy;

public class ConcreteDummyClass404 implements DummyClass404 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
