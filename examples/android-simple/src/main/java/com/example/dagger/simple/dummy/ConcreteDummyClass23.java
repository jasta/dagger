package com.example.dagger.simple.dummy;

public class ConcreteDummyClass23 implements DummyClass23 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
