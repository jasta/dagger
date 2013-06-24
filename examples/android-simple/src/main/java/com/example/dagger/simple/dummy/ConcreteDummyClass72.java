package com.example.dagger.simple.dummy;

public class ConcreteDummyClass72 implements DummyClass72 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
