package com.example.dagger.simple.dummy;

public class ConcreteDummyClass97 implements DummyClass97 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
