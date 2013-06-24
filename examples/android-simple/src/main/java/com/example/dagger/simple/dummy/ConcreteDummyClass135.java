package com.example.dagger.simple.dummy;

public class ConcreteDummyClass135 implements DummyClass135 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
