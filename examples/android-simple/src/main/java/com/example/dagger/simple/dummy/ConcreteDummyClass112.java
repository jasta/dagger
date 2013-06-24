package com.example.dagger.simple.dummy;

public class ConcreteDummyClass112 implements DummyClass112 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
