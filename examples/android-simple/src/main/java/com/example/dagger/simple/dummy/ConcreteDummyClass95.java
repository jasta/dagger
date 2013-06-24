package com.example.dagger.simple.dummy;

public class ConcreteDummyClass95 implements DummyClass95 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
