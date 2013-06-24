package com.example.dagger.simple.dummy;

public class ConcreteDummyClass69 implements DummyClass69 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
