package com.example.dagger.simple.dummy;

public class ConcreteDummyClass212 implements DummyClass212 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
