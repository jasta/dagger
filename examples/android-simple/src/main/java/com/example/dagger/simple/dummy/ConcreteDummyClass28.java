package com.example.dagger.simple.dummy;

public class ConcreteDummyClass28 implements DummyClass28 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
