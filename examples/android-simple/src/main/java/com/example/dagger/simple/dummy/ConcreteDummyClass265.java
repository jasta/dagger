package com.example.dagger.simple.dummy;

public class ConcreteDummyClass265 implements DummyClass265 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
