package com.example.dagger.simple.dummy;

public class ConcreteDummyClass202 implements DummyClass202 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
