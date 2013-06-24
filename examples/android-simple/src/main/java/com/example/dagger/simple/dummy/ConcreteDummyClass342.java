package com.example.dagger.simple.dummy;

public class ConcreteDummyClass342 implements DummyClass342 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
