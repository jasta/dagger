package com.example.dagger.simple.dummy;

public class ConcreteDummyClass4 implements DummyClass4 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
