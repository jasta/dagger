package com.example.dagger.simple.dummy;

public class ConcreteDummyClass402 implements DummyClass402 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
