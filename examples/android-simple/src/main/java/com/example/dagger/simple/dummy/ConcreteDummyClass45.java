package com.example.dagger.simple.dummy;

public class ConcreteDummyClass45 implements DummyClass45 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
