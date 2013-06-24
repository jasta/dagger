package com.example.dagger.simple.dummy;

public class ConcreteDummyClass333 implements DummyClass333 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
