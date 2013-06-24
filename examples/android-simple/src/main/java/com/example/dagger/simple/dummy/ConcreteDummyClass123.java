package com.example.dagger.simple.dummy;

public class ConcreteDummyClass123 implements DummyClass123 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
