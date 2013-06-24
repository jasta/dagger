package com.example.dagger.simple.dummy;

public class ConcreteDummyClass322 implements DummyClass322 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
