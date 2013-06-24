package com.example.dagger.simple.dummy;

public class ConcreteDummyClass405 implements DummyClass405 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
