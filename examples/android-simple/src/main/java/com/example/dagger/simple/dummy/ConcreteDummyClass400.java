package com.example.dagger.simple.dummy;

public class ConcreteDummyClass400 implements DummyClass400 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
