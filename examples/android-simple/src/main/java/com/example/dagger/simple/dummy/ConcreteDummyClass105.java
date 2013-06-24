package com.example.dagger.simple.dummy;

public class ConcreteDummyClass105 implements DummyClass105 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
