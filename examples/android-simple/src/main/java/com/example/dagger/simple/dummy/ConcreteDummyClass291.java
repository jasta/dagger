package com.example.dagger.simple.dummy;

public class ConcreteDummyClass291 implements DummyClass291 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
