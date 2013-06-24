package com.example.dagger.simple.dummy;

public class ConcreteDummyClass60 implements DummyClass60 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
