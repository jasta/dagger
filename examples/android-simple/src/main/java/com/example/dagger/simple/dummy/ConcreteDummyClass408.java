package com.example.dagger.simple.dummy;

public class ConcreteDummyClass408 implements DummyClass408 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
