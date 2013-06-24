package com.example.dagger.simple.dummy;

public class ConcreteDummyClass62 implements DummyClass62 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
