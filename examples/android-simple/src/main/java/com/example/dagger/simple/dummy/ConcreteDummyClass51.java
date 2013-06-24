package com.example.dagger.simple.dummy;

public class ConcreteDummyClass51 implements DummyClass51 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
