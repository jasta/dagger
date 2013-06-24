package com.example.dagger.simple.dummy;

public class ConcreteDummyClass492 implements DummyClass492 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
