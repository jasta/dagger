package com.example.dagger.simple.dummy;

public class ConcreteDummyClass385 implements DummyClass385 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
