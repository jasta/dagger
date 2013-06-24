package com.example.dagger.simple.dummy;

public class ConcreteDummyClass74 implements DummyClass74 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
