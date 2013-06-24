package com.example.dagger.simple.dummy;

public class ConcreteDummyClass243 implements DummyClass243 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
