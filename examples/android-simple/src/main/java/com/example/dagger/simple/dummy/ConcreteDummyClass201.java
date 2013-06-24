package com.example.dagger.simple.dummy;

public class ConcreteDummyClass201 implements DummyClass201 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
