package com.example.dagger.simple.dummy;

public class ConcreteDummyClass43 implements DummyClass43 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
