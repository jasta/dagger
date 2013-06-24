package com.example.dagger.simple.dummy;

public class ConcreteDummyClass84 implements DummyClass84 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
