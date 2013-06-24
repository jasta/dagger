package com.example.dagger.simple.dummy;

public class ConcreteDummyClass27 implements DummyClass27 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
