package com.example.dagger.simple.dummy;

public class ConcreteDummyClass421 implements DummyClass421 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
