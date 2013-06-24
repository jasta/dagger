package com.example.dagger.simple.dummy;

public class ConcreteDummyClass118 implements DummyClass118 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
