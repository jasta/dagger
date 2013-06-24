package com.example.dagger.simple.dummy;

public class ConcreteDummyClass304 implements DummyClass304 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
