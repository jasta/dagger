package com.example.dagger.simple.dummy;

public class ConcreteDummyClass323 implements DummyClass323 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
