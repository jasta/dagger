package com.example.dagger.simple.dummy;

public class ConcreteDummyClass79 implements DummyClass79 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
