package com.example.dagger.simple.dummy;

public class ConcreteDummyClass350 implements DummyClass350 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
