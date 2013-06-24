package com.example.dagger.simple.dummy;

public class ConcreteDummyClass234 implements DummyClass234 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
