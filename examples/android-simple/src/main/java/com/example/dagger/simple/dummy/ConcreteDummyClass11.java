package com.example.dagger.simple.dummy;

public class ConcreteDummyClass11 implements DummyClass11 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
