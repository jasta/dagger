package com.example.dagger.simple.dummy;

public class ConcreteDummyClass15 implements DummyClass15 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
