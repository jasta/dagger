package com.example.dagger.simple.dummy;

public class ConcreteDummyClass312 implements DummyClass312 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
