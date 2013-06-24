package com.example.dagger.simple.dummy;

public class ConcreteDummyClass222 implements DummyClass222 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
