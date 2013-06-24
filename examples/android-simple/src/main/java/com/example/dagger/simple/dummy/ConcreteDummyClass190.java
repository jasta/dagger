package com.example.dagger.simple.dummy;

public class ConcreteDummyClass190 implements DummyClass190 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
