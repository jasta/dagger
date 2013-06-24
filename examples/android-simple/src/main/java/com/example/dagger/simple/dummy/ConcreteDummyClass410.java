package com.example.dagger.simple.dummy;

public class ConcreteDummyClass410 implements DummyClass410 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
