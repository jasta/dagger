package com.example.dagger.simple.dummy;

public class ConcreteDummyClass107 implements DummyClass107 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
