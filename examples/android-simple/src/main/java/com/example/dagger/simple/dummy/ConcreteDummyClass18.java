package com.example.dagger.simple.dummy;

public class ConcreteDummyClass18 implements DummyClass18 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
