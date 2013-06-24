package com.example.dagger.simple.dummy;

public class ConcreteDummyClass164 implements DummyClass164 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
