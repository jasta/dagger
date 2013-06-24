package com.example.dagger.simple.dummy;

public class ConcreteDummyClass26 implements DummyClass26 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
