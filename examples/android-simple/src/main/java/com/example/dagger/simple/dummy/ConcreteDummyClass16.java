package com.example.dagger.simple.dummy;

public class ConcreteDummyClass16 implements DummyClass16 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
