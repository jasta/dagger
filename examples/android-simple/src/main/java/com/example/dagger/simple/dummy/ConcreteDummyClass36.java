package com.example.dagger.simple.dummy;

public class ConcreteDummyClass36 implements DummyClass36 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
