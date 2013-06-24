package com.example.dagger.simple.dummy;

public class ConcreteDummyClass101 implements DummyClass101 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
