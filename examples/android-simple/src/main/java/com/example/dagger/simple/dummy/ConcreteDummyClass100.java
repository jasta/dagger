package com.example.dagger.simple.dummy;

public class ConcreteDummyClass100 implements DummyClass100 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
