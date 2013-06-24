package com.example.dagger.simple.dummy;

public class ConcreteDummyClass108 implements DummyClass108 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
