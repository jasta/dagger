package com.example.dagger.simple.dummy;

public class ConcreteDummyClass129 implements DummyClass129 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
