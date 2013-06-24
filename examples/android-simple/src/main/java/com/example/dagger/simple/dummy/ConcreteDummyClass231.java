package com.example.dagger.simple.dummy;

public class ConcreteDummyClass231 implements DummyClass231 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
