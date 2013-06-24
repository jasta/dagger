package com.example.dagger.simple.dummy;

public class ConcreteDummyClass165 implements DummyClass165 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
