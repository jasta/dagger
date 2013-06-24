package com.example.dagger.simple.dummy;

public class ConcreteDummyClass308 implements DummyClass308 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
