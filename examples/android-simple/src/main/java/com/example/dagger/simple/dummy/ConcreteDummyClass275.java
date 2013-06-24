package com.example.dagger.simple.dummy;

public class ConcreteDummyClass275 implements DummyClass275 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
