package com.example.dagger.simple.dummy;

public class ConcreteDummyClass171 implements DummyClass171 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
