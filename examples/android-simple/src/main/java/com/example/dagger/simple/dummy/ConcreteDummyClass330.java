package com.example.dagger.simple.dummy;

public class ConcreteDummyClass330 implements DummyClass330 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
