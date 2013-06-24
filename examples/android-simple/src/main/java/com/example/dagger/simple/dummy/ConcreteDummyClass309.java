package com.example.dagger.simple.dummy;

public class ConcreteDummyClass309 implements DummyClass309 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
