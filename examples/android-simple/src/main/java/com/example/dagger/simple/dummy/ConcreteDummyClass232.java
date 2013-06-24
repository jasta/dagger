package com.example.dagger.simple.dummy;

public class ConcreteDummyClass232 implements DummyClass232 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
