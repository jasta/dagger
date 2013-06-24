package com.example.dagger.simple.dummy;

public class ConcreteDummyClass415 implements DummyClass415 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
