package com.example.dagger.simple.dummy;

public class ConcreteDummyClass422 implements DummyClass422 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
