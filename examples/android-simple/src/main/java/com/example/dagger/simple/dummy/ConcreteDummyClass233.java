package com.example.dagger.simple.dummy;

public class ConcreteDummyClass233 implements DummyClass233 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
