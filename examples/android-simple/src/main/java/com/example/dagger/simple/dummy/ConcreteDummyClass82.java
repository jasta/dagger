package com.example.dagger.simple.dummy;

public class ConcreteDummyClass82 implements DummyClass82 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
