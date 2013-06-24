package com.example.dagger.simple.dummy;

public class ConcreteDummyClass331 implements DummyClass331 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
