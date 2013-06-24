package com.example.dagger.simple.dummy;

public class ConcreteDummyClass283 implements DummyClass283 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
