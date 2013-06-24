package com.example.dagger.simple.dummy;

public class ConcreteDummyClass140 implements DummyClass140 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
