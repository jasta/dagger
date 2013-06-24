package com.example.dagger.simple.dummy;

public class ConcreteDummyClass224 implements DummyClass224 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
