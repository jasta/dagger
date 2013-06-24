package com.example.dagger.simple.dummy;

public class ConcreteDummyClass247 implements DummyClass247 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
