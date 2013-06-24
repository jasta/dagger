package com.example.dagger.simple.dummy;

public class ConcreteDummyClass141 implements DummyClass141 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
