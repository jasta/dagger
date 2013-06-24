package com.example.dagger.simple.dummy;

public class ConcreteDummyClass87 implements DummyClass87 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
