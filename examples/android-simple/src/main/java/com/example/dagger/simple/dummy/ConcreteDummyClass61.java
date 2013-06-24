package com.example.dagger.simple.dummy;

public class ConcreteDummyClass61 implements DummyClass61 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
