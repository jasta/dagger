package com.example.dagger.simple.dummy;

public class ConcreteDummyClass213 implements DummyClass213 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
