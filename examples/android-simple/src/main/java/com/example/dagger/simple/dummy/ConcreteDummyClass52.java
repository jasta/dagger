package com.example.dagger.simple.dummy;

public class ConcreteDummyClass52 implements DummyClass52 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
