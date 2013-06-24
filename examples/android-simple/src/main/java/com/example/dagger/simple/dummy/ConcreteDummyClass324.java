package com.example.dagger.simple.dummy;

public class ConcreteDummyClass324 implements DummyClass324 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
