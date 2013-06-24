package com.example.dagger.simple.dummy;

public class ConcreteDummyClass313 implements DummyClass313 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
