package com.example.dagger.simple.dummy;

public class ConcreteDummyClass128 implements DummyClass128 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
