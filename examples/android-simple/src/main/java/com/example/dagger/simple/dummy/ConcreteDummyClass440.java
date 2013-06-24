package com.example.dagger.simple.dummy;

public class ConcreteDummyClass440 implements DummyClass440 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
