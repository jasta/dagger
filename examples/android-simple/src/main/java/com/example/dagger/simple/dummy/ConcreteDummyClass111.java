package com.example.dagger.simple.dummy;

public class ConcreteDummyClass111 implements DummyClass111 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
