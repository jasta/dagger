package com.example.dagger.simple.dummy;

public class ConcreteDummyClass255 implements DummyClass255 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
