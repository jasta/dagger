package com.example.dagger.simple.dummy;

public class ConcreteDummyClass78 implements DummyClass78 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
