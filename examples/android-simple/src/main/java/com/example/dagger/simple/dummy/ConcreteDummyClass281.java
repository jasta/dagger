package com.example.dagger.simple.dummy;

public class ConcreteDummyClass281 implements DummyClass281 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
