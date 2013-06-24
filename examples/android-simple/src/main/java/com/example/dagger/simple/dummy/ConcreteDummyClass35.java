package com.example.dagger.simple.dummy;

public class ConcreteDummyClass35 implements DummyClass35 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
