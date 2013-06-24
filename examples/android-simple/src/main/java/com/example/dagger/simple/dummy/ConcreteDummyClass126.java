package com.example.dagger.simple.dummy;

public class ConcreteDummyClass126 implements DummyClass126 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
