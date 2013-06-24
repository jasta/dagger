package com.example.dagger.simple.dummy;

public class ConcreteDummyClass214 implements DummyClass214 {
    @Override
    public void printHello() {
        System.out.println("Hello from " + getClass().getSimpleName());
    }
}
