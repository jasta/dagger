package com.example.dagger.simple.dummy;

public class ConcreteDummyClass32 implements DummyClass32 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
