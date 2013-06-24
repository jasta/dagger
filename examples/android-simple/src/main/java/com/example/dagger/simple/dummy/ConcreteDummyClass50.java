package com.example.dagger.simple.dummy;

public class ConcreteDummyClass50 implements DummyClass50 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
