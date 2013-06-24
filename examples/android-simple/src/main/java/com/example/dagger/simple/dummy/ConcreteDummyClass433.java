package com.example.dagger.simple.dummy;

public class ConcreteDummyClass433 implements DummyClass433 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
