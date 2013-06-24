package com.example.dagger.simple.dummy;

public class ConcreteDummyClass96 implements DummyClass96 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
