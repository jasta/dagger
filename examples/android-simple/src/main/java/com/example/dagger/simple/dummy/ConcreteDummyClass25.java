package com.example.dagger.simple.dummy;

public class ConcreteDummyClass25 implements DummyClass25 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
