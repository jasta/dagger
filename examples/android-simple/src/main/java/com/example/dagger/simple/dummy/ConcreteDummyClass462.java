package com.example.dagger.simple.dummy;

public class ConcreteDummyClass462 implements DummyClass462 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
