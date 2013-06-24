package com.example.dagger.simple.dummy;

public class ConcreteDummyClass260 implements DummyClass260 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
