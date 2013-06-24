package com.example.dagger.simple.dummy;

public class ConcreteDummyClass44 implements DummyClass44 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
