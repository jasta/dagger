package com.example.dagger.simple.dummy;

public class ConcreteDummyClass343 implements DummyClass343 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
