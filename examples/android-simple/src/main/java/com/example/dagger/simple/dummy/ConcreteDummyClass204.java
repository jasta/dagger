package com.example.dagger.simple.dummy;

public class ConcreteDummyClass204 implements DummyClass204 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
