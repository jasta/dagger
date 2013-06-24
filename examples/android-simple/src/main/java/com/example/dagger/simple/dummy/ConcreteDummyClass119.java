package com.example.dagger.simple.dummy;

public class ConcreteDummyClass119 implements DummyClass119 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
