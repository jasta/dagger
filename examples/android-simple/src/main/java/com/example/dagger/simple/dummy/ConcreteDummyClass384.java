package com.example.dagger.simple.dummy;

public class ConcreteDummyClass384 implements DummyClass384 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
