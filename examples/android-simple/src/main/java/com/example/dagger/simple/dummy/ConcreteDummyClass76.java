package com.example.dagger.simple.dummy;

public class ConcreteDummyClass76 implements DummyClass76 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
