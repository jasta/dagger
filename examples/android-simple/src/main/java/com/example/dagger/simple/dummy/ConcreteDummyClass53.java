package com.example.dagger.simple.dummy;

public class ConcreteDummyClass53 implements DummyClass53 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
