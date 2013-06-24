package com.example.dagger.simple.dummy;

public class ConcreteDummyClass142 implements DummyClass142 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
