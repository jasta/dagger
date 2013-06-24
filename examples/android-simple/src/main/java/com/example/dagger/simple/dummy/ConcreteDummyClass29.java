package com.example.dagger.simple.dummy;

public class ConcreteDummyClass29 implements DummyClass29 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
