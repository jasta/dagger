package com.example.dagger.simple.dummy;

public class ConcreteDummyClass40 implements DummyClass40 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
