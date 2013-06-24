package com.example.dagger.simple.dummy;

public class ConcreteDummyClass91 implements DummyClass91 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
