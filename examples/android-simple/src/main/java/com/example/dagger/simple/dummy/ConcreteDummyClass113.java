package com.example.dagger.simple.dummy;

public class ConcreteDummyClass113 implements DummyClass113 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
