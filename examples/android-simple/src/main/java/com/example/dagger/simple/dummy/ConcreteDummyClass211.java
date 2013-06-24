package com.example.dagger.simple.dummy;

public class ConcreteDummyClass211 implements DummyClass211 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
