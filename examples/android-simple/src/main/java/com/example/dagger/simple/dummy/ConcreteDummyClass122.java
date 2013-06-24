package com.example.dagger.simple.dummy;

public class ConcreteDummyClass122 implements DummyClass122 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
