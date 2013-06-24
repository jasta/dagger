package com.example.dagger.simple.dummy;

public class ConcreteDummyClass207 implements DummyClass207 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
