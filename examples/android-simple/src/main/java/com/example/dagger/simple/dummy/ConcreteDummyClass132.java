package com.example.dagger.simple.dummy;

public class ConcreteDummyClass132 implements DummyClass132 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
