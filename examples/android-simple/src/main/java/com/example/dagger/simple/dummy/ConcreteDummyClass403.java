package com.example.dagger.simple.dummy;

public class ConcreteDummyClass403 implements DummyClass403 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
