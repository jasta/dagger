package com.example.dagger.simple.dummy;

public class ConcreteDummyClass445 implements DummyClass445 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
