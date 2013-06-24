package com.example.dagger.simple.dummy;

public class ConcreteDummyClass270 implements DummyClass270 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
