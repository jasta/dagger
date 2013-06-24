package com.example.dagger.simple.dummy;

public class ConcreteDummyClass99 implements DummyClass99 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
