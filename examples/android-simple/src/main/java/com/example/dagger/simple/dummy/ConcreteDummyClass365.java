package com.example.dagger.simple.dummy;

public class ConcreteDummyClass365 implements DummyClass365 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
