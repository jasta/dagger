package com.example.dagger.simple.dummy;

public class ConcreteDummyClass185 implements DummyClass185 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
