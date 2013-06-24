package com.example.dagger.simple.dummy;

public class ConcreteDummyClass143 implements DummyClass143 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
