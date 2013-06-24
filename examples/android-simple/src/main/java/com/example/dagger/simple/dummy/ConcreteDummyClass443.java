package com.example.dagger.simple.dummy;

public class ConcreteDummyClass443 implements DummyClass443 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
