package com.example.dagger.simple.dummy;

public class ConcreteDummyClass413 implements DummyClass413 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
