package com.example.dagger.simple.dummy;

public class ConcreteDummyClass120 implements DummyClass120 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
