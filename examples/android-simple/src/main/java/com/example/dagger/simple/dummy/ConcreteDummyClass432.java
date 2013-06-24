package com.example.dagger.simple.dummy;

public class ConcreteDummyClass432 implements DummyClass432 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
