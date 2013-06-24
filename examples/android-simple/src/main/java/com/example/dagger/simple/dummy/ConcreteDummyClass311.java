package com.example.dagger.simple.dummy;

public class ConcreteDummyClass311 implements DummyClass311 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
