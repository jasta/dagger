package com.example.dagger.simple.dummy;

public class ConcreteDummyClass33 implements DummyClass33 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
