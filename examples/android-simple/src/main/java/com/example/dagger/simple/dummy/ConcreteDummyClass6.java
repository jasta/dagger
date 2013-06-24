package com.example.dagger.simple.dummy;

public class ConcreteDummyClass6 implements DummyClass6 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
