package com.example.dagger.simple.dummy;

public class ConcreteDummyClass456 implements DummyClass456 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
