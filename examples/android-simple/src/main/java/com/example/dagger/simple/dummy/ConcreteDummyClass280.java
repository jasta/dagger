package com.example.dagger.simple.dummy;

public class ConcreteDummyClass280 implements DummyClass280 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
