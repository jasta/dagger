package com.example.dagger.simple.dummy;

public class ConcreteDummyClass24 implements DummyClass24 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
