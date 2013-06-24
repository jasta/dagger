package com.example.dagger.simple.dummy;

public class ConcreteDummyClass303 implements DummyClass303 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
