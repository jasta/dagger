package com.example.dagger.simple.dummy;

public class ConcreteDummyClass192 implements DummyClass192 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
