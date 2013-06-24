package com.example.dagger.simple.dummy;

public class ConcreteDummyClass170 implements DummyClass170 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
