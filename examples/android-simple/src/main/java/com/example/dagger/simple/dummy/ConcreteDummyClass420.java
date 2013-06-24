package com.example.dagger.simple.dummy;

public class ConcreteDummyClass420 implements DummyClass420 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
