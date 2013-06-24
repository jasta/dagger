package com.example.dagger.simple.dummy;

public class ConcreteDummyClass30 implements DummyClass30 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
