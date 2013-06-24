package com.example.dagger.simple.dummy;

public class ConcreteDummyClass292 implements DummyClass292 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
