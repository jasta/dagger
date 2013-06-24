package com.example.dagger.simple.dummy;

public class ConcreteDummyClass85 implements DummyClass85 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
