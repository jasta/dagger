package com.example.dagger.simple.dummy;

public class ConcreteDummyClass71 implements DummyClass71 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
