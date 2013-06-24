package com.example.dagger.simple.dummy;

public class ConcreteDummyClass41 implements DummyClass41 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
