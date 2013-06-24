package com.example.dagger.simple.dummy;

public class ConcreteDummyClass110 implements DummyClass110 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
