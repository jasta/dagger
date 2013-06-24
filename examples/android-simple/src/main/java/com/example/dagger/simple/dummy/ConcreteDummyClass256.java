package com.example.dagger.simple.dummy;

public class ConcreteDummyClass256 implements DummyClass256 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
