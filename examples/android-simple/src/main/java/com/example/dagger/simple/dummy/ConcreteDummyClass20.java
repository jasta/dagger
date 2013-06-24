package com.example.dagger.simple.dummy;

public class ConcreteDummyClass20 implements DummyClass20 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
