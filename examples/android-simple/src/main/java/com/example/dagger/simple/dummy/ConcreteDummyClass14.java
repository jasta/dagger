package com.example.dagger.simple.dummy;

public class ConcreteDummyClass14 implements DummyClass14 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
