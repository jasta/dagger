package com.example.dagger.simple.dummy;

public class ConcreteDummyClass162 implements DummyClass162 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
