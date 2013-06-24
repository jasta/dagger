package com.example.dagger.simple.dummy;

public class ConcreteDummyClass340 implements DummyClass340 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
