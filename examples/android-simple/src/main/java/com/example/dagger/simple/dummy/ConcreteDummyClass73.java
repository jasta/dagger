package com.example.dagger.simple.dummy;

public class ConcreteDummyClass73 implements DummyClass73 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
