package com.example.dagger.simple.dummy;

public class ConcreteDummyClass261 implements DummyClass261 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
