package com.example.dagger.simple.dummy;

public class ConcreteDummyClass173 implements DummyClass173 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
