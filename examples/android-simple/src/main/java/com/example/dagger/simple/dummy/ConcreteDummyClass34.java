package com.example.dagger.simple.dummy;

public class ConcreteDummyClass34 implements DummyClass34 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
