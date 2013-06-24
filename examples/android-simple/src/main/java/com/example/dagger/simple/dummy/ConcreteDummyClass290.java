package com.example.dagger.simple.dummy;

public class ConcreteDummyClass290 implements DummyClass290 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
