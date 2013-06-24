package com.example.dagger.simple.dummy;

public class ConcreteDummyClass169 implements DummyClass169 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
