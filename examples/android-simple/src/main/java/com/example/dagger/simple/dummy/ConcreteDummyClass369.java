package com.example.dagger.simple.dummy;

public class ConcreteDummyClass369 implements DummyClass369 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
